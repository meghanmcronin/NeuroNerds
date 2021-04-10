#include <errno.h>
#include <jni.h>
#include <sstream>

#include "vtkNew.h"
#include "vtkNIFTIImageReader.h"
#include "vtkActor.h"
#include "vtkCamera.h"
#include "vtkColorTransferFunction.h"
#include "vtkConeSource.h"
#include "vtkDebugLeaks.h"
#include "vtkGlyph3D.h"
#include "vtkImageData.h"
#include "vtkOpenGLGPUVolumeRayCastMapper.h"
#include "vtkPiecewiseFunction.h"
#include "vtkPointData.h"
#include "vtkPolyData.h"
#include "vtkPolyDataMapper.h"
#include "vtkRenderWindow.h"
#include "vtkRenderer.h"
#include "vtkSphereSource.h"
#include "vtkTextActor.h"
#include "vtkTextProperty.h"
#include "vtkVolume.h"
#include "vtkVolumeProperty.h"
#include "vtkSmartPointer.h"

#include "vtkAndroidRenderWindowInteractor.h"
#include "vtkCommand.h"

#include <android/log.h>

#define  LOG_TAG    "someTag"

#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)
#define  LOGW(...)  __android_log_print(ANDROID_LOG_WARN,LOG_TAG,__VA_ARGS__)
#define  LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG,LOG_TAG,__VA_ARGS__)
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)

struct userData
{
    vtkRenderWindow* RenderWindow;
    vtkRenderer* Renderer;
    vtkAndroidRenderWindowInteractor* Interactor;
};

extern "C" jlong Java_com_example_myapplication_MainActivity_init(
        JNIEnv* env, jclass obj, jint width, jint height)
{
    LOGD("Begin initialization");
    vtkRenderWindow* renWin = vtkRenderWindow::New();
    char jniS[4] = { 'j', 'n', 'i', 0 };
    renWin->SetWindowInfo(jniS); // tell the system that jni owns the window not us
    renWin->SetSize(width, height);
    vtkNew<vtkRenderer> renderer;
    renWin->AddRenderer(renderer.Get());

    vtkNew<vtkAndroidRenderWindowInteractor> iren;
    iren->SetRenderWindow(renWin);

    vtkNew<vtkOpenGLGPUVolumeRayCastMapper> volumeMapper;

    vtkNew<vtkPiecewiseFunction> pwf;

    vtkNew<vtkNIFTIImageReader> mi;
    mi->SetFileName("/storage/emulated/0/sub-0060_ses-1_T1w.nii.gz");
    LOGD("Read from nifti");
    mi->Update();
    LOGD("Finished reading");
    volumeMapper->SetInputConnection(mi->GetOutputPort());
    volumeMapper->SetAutoAdjustSampleDistances(1);
    volumeMapper->SetSampleDistance(0.5);

    double tweak = 80.0;
    pwf->AddPoint(0, 0);
    pwf->AddPoint(255 * (67.0106 + tweak) / 3150.0, 0);
    pwf->AddPoint(255 * (251.105 + tweak) / 3150.0, 0.3);
    pwf->AddPoint(255 * (439.291 + tweak) / 3150.0, 0.5);
    pwf->AddPoint(255 * 3071 / 3150.0, 0.616071);

    volumeMapper->SetAutoAdjustSampleDistances(1);
    volumeMapper->SetSampleDistance(0.5);

    vtkNew<vtkVolumeProperty> volumeProperty;
    volumeProperty->SetShade(1);
    volumeProperty->SetInterpolationTypeToLinear();

    vtkNew<vtkColorTransferFunction> ctf;
    ctf->AddRGBPoint(0, 0, 0, 0);
    ctf->AddRGBPoint(255 * 67.0106 / 3150.0, 0.54902, 0.25098, 0.14902);
    ctf->AddRGBPoint(255 * 251.105 / 3150.0, 0.882353, 0.603922, 0.290196);
    ctf->AddRGBPoint(255 * 439.291 / 3150.0, 1, 0.937033, 0.954531);
    ctf->AddRGBPoint(255 * 3071 / 3150.0, 0.827451, 0.658824, 1);

    volumeProperty->SetColor(ctf.GetPointer());
    volumeProperty->SetScalarOpacity(pwf.GetPointer());

    vtkNew<vtkVolume> volume;
    volume->SetMapper(volumeMapper.GetPointer());
    volume->SetProperty(volumeProperty.GetPointer());

    renderer->SetBackground2(0.2, 0.3, 0.4);
    renderer->SetBackground(0.1, 0.1, 0.1);
    renderer->GradientBackgroundOn();
    renderer->AddVolume(volume.GetPointer());
    renderer->ResetCamera();

    renderer->GetActiveCamera()->Zoom(0.7);

    struct userData* foo = new struct userData();
    foo->RenderWindow = renWin;
    foo->Renderer = renderer.Get();
    foo->Interactor = iren.Get();

    return (jlong)foo;
}

extern "C" JNIEXPORT void JNICALL Java_com_example_myapplication_MainActivity_render(
        JNIEnv* env, jclass obj, jlong udp)
{
    struct userData* foo = (userData*)(udp);
    foo->RenderWindow->SwapBuffersOff(); // android does it
    foo->RenderWindow->Render();
    foo->RenderWindow->SwapBuffersOn(); // reset
}
