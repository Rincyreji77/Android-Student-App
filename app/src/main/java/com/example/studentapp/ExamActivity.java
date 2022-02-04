package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExamActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getSemester,getExamname,getExamdate,getRemarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        ed1=(EditText)findViewById(R.id.semester);
        ed2=(EditText)findViewById(R.id.exm_name);
        ed3=(EditText)findViewById(R.id.exm_dt);
        ed4=(EditText)findViewById(R.id.remark);
        b1=(AppCompatButton)findViewById(R.id.submit);
        b2=(AppCompatButton)findViewById(R.id.back_db);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSemester=ed1.getText().toString();
                getExamname=ed2.getText().toString();
                getExamdate=ed3.getText().toString();
                getRemarks=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getSemester,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getExamname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getExamdate,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRemarks,Toast.LENGTH_LONG).show();
            }
        });
    }
}