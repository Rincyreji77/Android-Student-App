package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getname,getrollno,getadmission,getUsername,getpassword,getconfirm;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.roll_no);
        ed3=(EditText)findViewById(R.id.adm_no);
        ed4=(EditText)findViewById(R.id.uname);
        ed5=(EditText)findViewById(R.id.pwd);
        ed6=(EditText)findViewById(R.id.con_pwd);
        b1=(AppCompatButton)findViewById(R.id.registerbtn);
        b2=(AppCompatButton)findViewById(R.id.loginbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getrollno=ed2.getText().toString();
                getadmission=ed3.getText().toString();
                getUsername=ed4.getText().toString();
                getpassword=ed5.getText().toString();
                getconfirm=ed6.getText().toString();


                if(getpassword.equals(getconfirm)) {
                    Toast.makeText(getApplicationContext(),getname,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getrollno,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getadmission,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getconfirm,Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}