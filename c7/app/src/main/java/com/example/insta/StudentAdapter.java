package com.example.insta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {
    List<Student> studentlist;
    public StudentAdapter(@NonNull Context context, int resource,@NonNull List<Student> objects) {
        super(context, resource,objects);
        studentlist = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.listitems,parent ,false);

        Student currentdetails = studentlist.get(position);

        TextView studentname = view.findViewById(R.id.name);

        ImageView studentimage = view.findViewById(R.id.image);

        studentname.setText(currentdetails.getStudentAge());
        studentimage.setImageResource(currentdetails.getStudnetimg());
        return view;

    }
}
