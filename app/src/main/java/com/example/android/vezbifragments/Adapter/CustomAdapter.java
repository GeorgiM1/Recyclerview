package com.example.android.vezbifragments.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.vezbifragments.Model.Student;
import com.example.android.vezbifragments.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pc on 12/9/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context _context;

    ArrayList<Student> studentList = new ArrayList<Student>();

    public void setItems (ArrayList<Student> students){
        studentList =students;
        notifyDataSetChanged();
    }
    public  CustomAdapter (Context context){
        _context = context;

    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recylcer_view, parent, false);
        ViewHolder viewHolder = new ViewHolder (view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.studentID.setText(student.getsName());

        Picasso.with(_context).load(student.getUrl()).centerCrop().fit().into(holder.img);

if (student.issOnline()){
    holder.connecetdToInternet.setText("ONLINE");
    holder.connecetdToInternet.setTextColor(Color.GREEN);
}else {
    holder.connecetdToInternet.setText("OFFLINE");
    holder.connecetdToInternet.setTextColor(Color.RED);
}

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.studentID)
        TextView studentID;
        @BindView(R.id.connected)
        TextView connecetdToInternet;
        @BindView(R.id.imgID)
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

    public void clearList (){
        studentList.clear();
        notifyDataSetChanged();
    }
}
