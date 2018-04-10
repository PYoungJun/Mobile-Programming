package com.example.parkyoungjun.lab1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    int imageIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.bar);            /**match id which is bar*/
        imageView2=(ImageView)findViewById(R.id.real);           /**match id which is real*/
    }
    public void onButton1Clicked(View v){
        changeImage();              /**the event is occured when clicked the button*/
    }
    private void changeImage(){
        if(imageIndex==0){
            imageView.setVisibility(View.VISIBLE);      /**if imageindex is 0 set image imageview*/
            imageView2.setVisibility(View.INVISIBLE);   /**and set imageindex 1*/

            imageIndex=1;
        }
        else if(imageIndex==1)
        {
            imageView.setVisibility(View.INVISIBLE);        /**if imageindex is 1 set image imageview*/
            imageView2.setVisibility(View.VISIBLE);         /**and set imageindex 0*/

            imageIndex=0;
        }
        //https://github.com/PYoungJun/MP_lab1-2.git
    }
}
