package com.example.matt.workmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button btn_register;
    EditText et_nameR;
    EditText et_employeeR;
    EditText et_passR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        et_passR = (EditText) findViewById(R.id.passR_et);
        et_nameR = (EditText) findViewById(R.id.nameR_et);
        et_employeeR = (EditText) findViewById(R.id.employIdR_et);
        btn_register = (Button) findViewById(R.id.register_btn);

        btn_register.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.register_btn:

                String name = et_nameR.getText().toString();
                String employeeid = et_employeeR.getText().toString();
                String pass = et_passR.getText().toString();

                User registeredData = new User(name,employeeid,pass);

                break;


        }
    }
}