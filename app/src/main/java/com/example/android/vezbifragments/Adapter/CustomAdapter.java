package com.example.android.vezbifragments.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.vezbifragments.Model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 12/9/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context _context;

    List<Student> studentList = new ArrayList<Student>();

    public void setItems (List<Student> students){
        studentList =students;
    }
    public  CustomAdapter (Context context){
        _context = context;

    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
