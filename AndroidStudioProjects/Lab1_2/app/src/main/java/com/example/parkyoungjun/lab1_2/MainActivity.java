package com.example.parkyoungjun.lab1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText edit_name;
    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        btn_print=(Button)findViewById(R.id.button1);       //match id each one
        btn_clear=(Button)findViewById(R.id.button2);
        edit_name=(EditText)findViewById(R.id.write);
        view_print=(TextView)findViewById(R.id.hello);
    }
    public void clearClicked(View v){
       edit_name.setText("");               //when button clicked set edit_name blank
       view_print.setText("contents");      // and set view_print "contents"
    }
    public void printClicked(View v){
        String text = "";                   //set text blank
        text=text+edit_name.getText().toString();       //and get text from edit_name
        view_print.setText(text);           // then set view_print text
    }
}
