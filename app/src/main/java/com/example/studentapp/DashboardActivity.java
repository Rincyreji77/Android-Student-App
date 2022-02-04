package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mypreferences=getSharedPreferences("login",MODE_PRIVATE);


        b1=(AppCompatButton)findViewById(R.id.ad_crs);
        b2=(AppCompatButton)findViewById(R.id.ad_fclty);
        b3=(AppCompatButton)findViewById(R.id.ad_exm);
        b4=(AppCompatButton)findViewById(R.id.viewweb);
        b5=(AppCompatButton)findViewById(R.id.log);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit= mypreferences.edit();
                myedit.clear();
                myedit.commit();
                Toast.makeText(getApplicationContext(),"Logout Successfully",Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),WebActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),ExamActivity.class);
                startActivity(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(getApplicationContext(),FacultyActivity.class);
                startActivity(b);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(getApplicationContext(),CourseActivity.class);
                startActivity(c);
            }
        });
    }
}