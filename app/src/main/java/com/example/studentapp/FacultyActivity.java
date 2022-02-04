package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getFacultyname,getDepartment,getDesignation,getMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        ed1=(EditText)findViewById(R.id.fctly_name);
        ed2=(EditText)findViewById(R.id.dept);
        ed3=(EditText)findViewById(R.id.dgtn);
        ed4=(EditText)findViewById(R.id.mob_no);
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
                getFacultyname=ed1.getText().toString();
                getDepartment=ed2.getText().toString();
                getDesignation=ed3.getText().toString();
                getMobile=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getFacultyname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDepartment,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDesignation,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getMobile,Toast.LENGTH_LONG).show();
            }
        });
    }
}