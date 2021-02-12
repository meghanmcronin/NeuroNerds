package com.example.nsgapp;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.nio.file.Path;

public class Study {
    private int pub_date;
    private boolean isProcessing;
    private boolean available;
    private String status;
    private String name;
    private int patient; // Don't know how to set this attribute since it's a foreign key
    private Path data_loc;

   /* This code is from study models on the backend for reference
   ---------------------------------------------------------------
    pub_date = models.DateTimeField()
    isProcessing = models.BooleanField(default=False)
    available = models.BooleanField(default=False)
    status = models.CharField(max_length=200,default ='Not started')
    name = models.CharField(max_length=200)
    patient = models.ForeignKey(
            settings.AUTH_USER_MODEL,
            on_delete=models.CASCADE,
            #limit_choices_to={'user_type': 2},
            )
    data_loc = models.FilePathField(path=studies_path, blank=True)
    ---------------------------------------------------------------*/

    public int getPub_date() {
        return pub_date;
    }

    public boolean isProcessing() {
        return isProcessing;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getPatient() {
        return patient;
    }

    public Path getData_loc() {
        return data_loc;
    }
}
