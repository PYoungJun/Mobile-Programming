package com.example.parkyoungjun.lab3_3;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public Button btn_frag1;
    public Button btn_frag2;
    Frag1 fragment1;
    Frag2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setLisnter();
    }

    public void init() {

        btn_frag1 = findViewById(R.id.btn_frag1);               // match objects with xml source
        btn_frag2 = findViewById(R.id.btn_frag2);

        fragment1= new Frag1();
        fragment2= new Frag2();

    }
    public void setLisnter() {

        btn_frag1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_fragment,fragment1).commit();       //return to first fragment
            }

        });
        btn_frag2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_fragment,fragment2).commit();           // return second fragment
            }

        });

    }



}
