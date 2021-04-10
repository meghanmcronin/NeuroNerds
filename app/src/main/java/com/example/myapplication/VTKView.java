package com.example.myapplication;

import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.Log;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class VTKView extends GLSurfaceView
{
    private static String TAG = "VTKView";
    private final Renderer myRenderer;

    public VTKView(Context context)
    {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);

        setEGLContextClientVersion(2);

        /* Set the renderer responsible for frame rendering */
        this.myRenderer = new Renderer();
        this.setRenderer(myRenderer);
        this.setRenderMode(RENDERMODE_WHEN_DIRTY);
    }

    private static class Renderer implements GLSurfaceView.Renderer
    {
        private long vtkContext;

        public void onDrawFrame(GL10 gl)
        {
            MainActivity.render(vtkContext);
        }


        public void onSurfaceChanged(GL10 gl, int width, int height)
        {

            File sdcard = android.os.Environment.getExternalStorageDirectory();
            //Get the text file
            File file = new File(sdcard,"sub-0060_ses-1_T1w.nii.gz");
            File file2  = new File(sdcard, "testing");
            if(file.exists())
                Log.d("FILE", "file is " + String.valueOf(file));
            else{
                Log.d("FILE", "file does not exist");
            }
            if (file2.exists())
                Log.d("FILE", "fake file is " + String.valueOf(file2));
            else{
                Log.d("FILE", "fake file does not exist");
            }
            java.io.FileInputStream fIn = null;

            try {
                fIn = new java.io.FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            java.io.BufferedReader myReader = new java.io.BufferedReader(
                    new java.io.InputStreamReader(fIn));
            String aDataRow = "";
            String aBuffer = "";

//            while (true) {
//                try {
//                    if (!((aDataRow = myReader.readLine()) != null)) break;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                aBuffer += aDataRow + "\n";
//            }

            vtkContext =MainActivity.init(width, height);
        }

        public void onSurfaceCreated(GL10 gl, EGLConfig config)
        {
            // Do nothing.
        }
    }
}