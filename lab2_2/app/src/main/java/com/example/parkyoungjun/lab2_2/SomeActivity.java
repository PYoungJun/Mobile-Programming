package com.example.parkyoungjun.lab2_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class SomeActivity extends AppCompatActivity {

    EditText getURL;
    Button btnGo;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some);

        getURL = (EditText) findViewById(R.id.editText3);       //Match id wtih editText3
        btnGo = (Button) findViewById(R.id.button5);            //Match id with button5
        btnBack = (Button) findViewById(R.id.button6);          //Match id with button6
        Intent someIntent = getIntent();            //Make the intent

        final String theURL = someIntent.getStringExtra("theURL");
        getURL.setText(theURL);     //set getURL with the URL

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (theURL.isEmpty()) {
                    Toast.makeText(getApplicationContext()"주소를 다시 입력해주세요.", Toast.LENGTH_LONG).show();      //If the URL is empty alarm a messsage
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + theURL));          //If the URL is not empty go to URL
                    startActivity(intent);
                }

            }
        });
    }
}

