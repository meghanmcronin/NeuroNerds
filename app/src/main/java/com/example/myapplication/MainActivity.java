package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;


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
        if (Build.VERSION.SDK_INT >= 23) {
            Log.d("sdk", "SDK version >=23");
            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                android.support.v4.app.ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                Log.d("sdk", "Ask permission");
            }
            else {
            Log.d("sdk", "No need to ask permission");
            }
        }
        super.onCreate(icicle);
        mView = new VTKView(getApplication());
        this.setContentView(mView);
    }

}