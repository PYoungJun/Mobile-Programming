package com.example.parkyoungjun.lab3_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class AnotherActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    Button button2;
    protected void onCreate(Bundle savedInstanceState) { //match the object each source
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);


        text1= (TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);
        button2=(Button)findViewById(R.id.button2);

        Intent passedIntent =getIntent();

        Bundle bundle1 = passedIntent.getExtras();          //pass to bundle
        final String name = bundle1.getString("name");
        final String gender = bundle1.getString("gender");
        final String send=bundle1.getString("send");


        text1.setText(name);                 // display information
        text2.setText(gender);
        text3.setText(send);

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

