package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getUsername,getpassword;
SharedPreferences mypreferences;
String prefvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        prefvalue=mypreferences.getString("username","");
        if(prefvalue==null|| !prefvalue.isEmpty()) {
            Intent i =new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pwd);
        b1=(AppCompatButton)findViewById(R.id.loginbtn);
        b2=(AppCompatButton)findViewById(R.id.registerbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUsername=ed1.getText().toString();
                getpassword=ed2.getText().toString();
                if (getUsername.equals("Admin")&&(getpassword.equals("12345")))
                {
                    SharedPreferences.Editor myedit= mypreferences.edit();
                    myedit.putString("username","admin");
                    myedit.commit();
                 Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                 startActivity(i);
                }

                else{
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}