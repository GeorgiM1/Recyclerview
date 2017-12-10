package com.example.android.vezbifragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.android.vezbifragments.Adapter.CustomAdapter;
import com.example.android.vezbifragments.Model.Student;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @BindView(R.id.btn)
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    adapter = new CustomAdapter(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        btn.setText("GENERATE LIST");

    }
    @OnClick (R.id.btn)
    public void onBtnClick (View view){

      if (adapter.getItemCount() == 0){
          btn.setText("CLEAR ");
          generateList();

      }else {

          adapter.clearList();
          btn.setText("Generate");
      }
    }


    public void generateList() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Student ", true,
                "https://fundraise.globalbrigades.org/media_gallery/thumb/320/0/Engineering_2014_Icon_Small.png"));
        students.add(new Student("Student 1", false, "http://www.cs.cmu.edu/~tss/minelogo/minelogo-small.png"));
        students.add(new Student("Student 2", false,
                "https://fundraise.globalbrigades.org/media_gallery/thumb/320/0/Water_2014_Icon_Small.png"));
        students.add(new Student("Student 3", true,
                "https://www.humanrightslogo.net/sites/default/files/HRLogoCMYKsmallRGB.png"));
        adapter.setItems(students);
    }
}
