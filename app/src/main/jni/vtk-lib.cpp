#include <jni.h>
#include <vtkConeSource.h>

extern "C"
JNIEXPORT void JNICALL
Java_link_to_your_java_function(
        JNIEnv *env,
        jobject /*this*/) {

    vtkConeSource *cone = vtkConeSource::New();
    cone->SetHeight(3.0);
    cone->Delete();

}