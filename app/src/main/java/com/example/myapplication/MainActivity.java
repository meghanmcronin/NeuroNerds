package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    static
    {
        System.loadLibrary("vtk-lib");
    }
    /**
     * @param width the current view width
     * @param height the current view height
     */
    public static native long init(int width, int height);
    public static native void render(long udp);

    VTKView mView;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mView = new VTKView(getApplication());
        this.setContentView(mView);
    }
}