package com.example.parkyoungjun.lab2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);          //Match id with button1
        final EditText TextUrl=(EditText)findViewById(R.id.editText1) ;     //Match id with editText1

        button1.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View view){
                String text=TextUrl.getText().toString();       //Get the string from TextUrl
                Intent toIntent= new Intent(getApplicationContext(),SomeActivity.class);    //Make the Intent
                toIntent.putExtra("theURL",text);       //Put the string in the intent
                startActivity(toIntent);
            }
        });

    }
}
