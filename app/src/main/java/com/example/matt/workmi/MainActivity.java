package com.example.matt.workmi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_logout;
    Button btn_reg;

    UserLocalStorage userLocalStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_logout = (Button)   findViewById(R.id.logout_btn);
        btn_reg = (Button) findViewById(R.id.regUser_btn);

        btn_logout.setOnClickListener(this);
        btn_reg.setOnClickListener(this);

        userLocalStorage = new UserLocalStorage(this);

    }

    protected void OnStart(){
        super.onStart();

        if (authenticate() == true){

        }
    }
    private boolean authenticate(){
        return userLocalStorage.getUserLoggedIn();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.logout_btn:
                userLocalStorage.clearUserData();
                userLocalStorage.setUserLoggedIn(false);

                startActivity(new Intent(this, Login.class));


                break;

            case R.id.regUser_btn:

                startActivity(new Intent(this, Register.class));

                break;


        }
    }
}
