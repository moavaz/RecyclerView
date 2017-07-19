package com.example.moavaz.recyclerview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class student_activity extends ArrayAdapter<student> {

    public student_activity(@NonNull Context context, @LayoutRes ArrayList<student> students) {
        super(context, R.layout.activity_student_activity,students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        studentViewholder studentViewholder;

        TextView textView;
        TextView textView1;
        ImageView imageView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_student_activity, null);

            textView = (TextView) view.findViewById(R.id.idtext);
            textView1 = (TextView) view.findViewById(R.id.nametext);
            imageView = (ImageView) view.findViewById(R.id.hannah);

            studentViewholder = new studentViewholder(textView, textView1,imageView);
            view.setTag(studentViewholder);
        }
        student stu = getItem(position);

        studentViewholder = (studentViewholder) view.getTag();

        studentViewholder.textView.setText(""+stu.getId());
        studentViewholder.textView1.setText(""+stu.getName());
        studentViewholder.imageView.setImageResource(R.drawable.hannah);

        return view;
    }

    class studentViewholder {
        TextView textView;
        TextView textView1;
        ImageView imageView;

        public studentViewholder(TextView textView, TextView textView1, ImageView imageView) {
            this.textView = textView;
            this.textView1 = textView1;
            this.imageView = imageView;
        }
    }
}
