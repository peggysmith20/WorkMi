package com.example.matt.workmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WorkMiID extends AppCompatActivity implements View.OnClickListener{

    Button btn_wID;
    EditText et_wID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_mi_id);


        et_wID  = (EditText) findViewById(R.id.wMi_id);
        btn_wID = (Button)   findViewById(R.id.wMi_btn);

        btn_wID.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.wMi_btn:

                startActivity(new Intent(this, Login.class));
            break;
        }
    }
}
