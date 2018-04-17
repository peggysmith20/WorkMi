package com.example.matt.workmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {


    Button btn_login;
    EditText et_pass;
    EditText et_user;

    UserLocalStorage userLocalStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        et_pass = (EditText) findViewById(R.id.pass_et);
        et_user = (EditText) findViewById(R.id.employId_et);
        btn_login = (Button) findViewById(R.id.login_btn);

        btn_login.setOnClickListener(this);

        userLocalStorage = new UserLocalStorage(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.login_btn:

                User user = new User(null);

                userLocalStorage.storeUserData(user);
                userLocalStorage.setUserLoggedIn(true);

                startActivity(new Intent(this, MainActivity.class));


                break;


        }
    }
}

