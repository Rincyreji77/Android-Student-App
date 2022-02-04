package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getCoursename,getDescription,getDuration,getRemark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        ed1=(EditText)findViewById(R.id.crsname);
        ed2=(EditText)findViewById(R.id.descpt);
        ed3=(EditText)findViewById(R.id.duration);
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
                getCoursename=ed1.getText().toString();
                getDescription=ed2.getText().toString();
                getDuration=ed3.getText().toString();
                getRemark=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getCoursename,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDescription,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDuration,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRemark,Toast.LENGTH_LONG).show();

            }
        });
    }
}