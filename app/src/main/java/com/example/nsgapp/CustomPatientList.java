package com.example.nsgapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomPatientList extends BaseAdapter {

    private Activity context;
    ArrayList<Study> patients;

    public CustomPatientList(Activity context, ArrayList<Study> patients) {
        //   super(context, R.layout.row_item, countries);
        this.context = context;
        this.patients = patients;

    }

    public static class ViewHolder
    {
        //TextView textViewId;
        TextView textViewPatient;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;

        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if(convertView==null) {
            vh=new ViewHolder();
            row = inflater.inflate(R.layout.content_patient_list, null, true);
            //vh.textViewId = (TextView) row.findViewById(R.id.patientList);
            vh.textViewPatient = (TextView) row.findViewById(R.id.patientList);
            // store the holder with the view.
            row.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }

        vh.textViewPatient.setText(patients.get(position).getStudyName());
        //vh.textViewId.setText(""+countries.get(position).getId());

        return  row;
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
