package com.example.parkyoungjun.lab5_2;

import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    EditText editText1;
    TextView textView1;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = (Button)findViewById(R.id.button1);
        editText1 = (EditText)findViewById(R.id.editText1);
        textView1 = (TextView)findViewById(R.id.textView1);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              new Calculating (editText1.getText().toString()).execute();
            }
        });
    }
    class Calculating extends AsyncTask<Void,String,Void>{
        int theNum=1;
        int theResult=1;
        String progess="";
        public Calculating(String index){
            theNum=Integer.parseInt(index);

        }

        @Override
        protected void onPreExecute(){
            textView1.setText("START");
        }
        @Override
        protected Void doInBackground(Void...params){

            for(int k=theNum;k>=1;k--)
            {
                try {
                    Thread.sleep(500);
                    theResult=theResult*k;
                    progess=progess+k+" * ";
                    publishProgress(progess);
                }
                catch (Exception e){}
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(String...values){
            textView1.setText(values[0]);
        }
        @Override
        protected void onPostExecute(Void aVoid){
            textView1.setText("theResult is "+theResult);
        }
    }

}
