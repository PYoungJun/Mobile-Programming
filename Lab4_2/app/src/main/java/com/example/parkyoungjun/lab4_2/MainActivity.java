package com.example.parkyoungjun.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView textView,textView2;
    LinearLayout linearLayout;
    boolean isOpen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        textView=(TextView) findViewById(R.id.textview1);
        textView2=(TextView) findViewById(R.id.textview2);
        linearLayout=(LinearLayout) findViewById(R.id.linearLayout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate_move);       //the layout will sliding visible when button clicked
                linearLayout.setVisibility(View.VISIBLE);
                linearLayout.setAnimation(anim);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate_origin);        //the layout will sliding gone when button clicked
                linearLayout.startAnimation(anim2);
                linearLayout.setVisibility(View.GONE);

            }
        });
    }

}
