package com.example.parkyoungjun.lab2_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some);
        Intent someIntent=getIntent();
        if(someIntent!=null) {
            String Name = someIntent.getStringExtra("loginName");           //If someIntent is not null get the string from someIntent
            String Age = someIntent.getStringExtra("loginAge");
            Toast.makeText(getApplicationContext(), "Student info : " + Name + ", " + Age,          //Alarm Student info
                    Toast.LENGTH_LONG).show();
        }
        Button button0 = (Button) findViewById(R.id.button2);
        button0.setOnClickListener(new View.OnClickListener() {         //If button clicked, go back to MainActivity
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
