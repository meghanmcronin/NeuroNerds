package com.example.myapplication;

import android.content.Context;
import android.opengl.GLSurfaceView;

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
            vtkContext =MainActivity.init(width, height);
        }

        public void onSurfaceCreated(GL10 gl, EGLConfig config)
        {
            // Do nothing.
        }
    }
}