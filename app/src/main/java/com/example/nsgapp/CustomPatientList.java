package com.example.nsgapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

// Tutorial from: https://java2blog.com/retrofit-android-tutorial/

public class CustomPatientList extends BaseAdapter {

    private final Activity context;
    ArrayList<Study> patients;

    public CustomPatientList(Activity context, ArrayList<Study> patients) {
        this.context = context;
        this.patients = patients;
    }
    public static class ViewHolder
    {
        TextView textViewPatient;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if(convertView==null) {
            vh = new ViewHolder();
            row = inflater.inflate(R.layout.content_patient_list, null, true);
            vh.textViewPatient = (TextView) row.findViewById(R.id.patientList);
            row.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }

        String content = "";

        content += "Study Name: " + patients.get(position).getStudyName() + "\n";
        content += "Patient Name: " + patients.get(position).getPatientName() + "\n";
        content += "Study ID: " + patients.get(position).getStudyID() + "\n";
        content += "Study Status: " + patients.get(position).getStudyStatus() + "\n\n";

        vh.textViewPatient.setText(content);
        return row;
    }

    public long getItemId(int position) {
        return position;
    }

    public Object getItem(int position) {
        return position;
    }

    public int getCount() {

        if(patients.size()<=0)
            return 1;
        return patients.size();
    }
}
