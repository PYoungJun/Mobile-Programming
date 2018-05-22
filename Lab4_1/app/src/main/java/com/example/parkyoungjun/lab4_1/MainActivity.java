package com.example.parkyoungjun.lab4_1;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView vw = new MyView(this);
        setContentView(vw);
    }
    protected class MyView extends View {
        float startX;       // set the variation
        float startY;
        Path path = new Path();
        public MyView(Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            Paint pnt = new Paint();
            canvas.drawColor(Color.WHITE);      //set background color white

            pnt.setStyle(Paint.Style.STROKE);
            pnt.setStrokeWidth(10);
            pnt.setColor(Color.BLUE); //set background color blue
            canvas.drawPath(path,pnt);

            invalidate();//not reset the onDraw
        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            startX = event.getX();
            startY = event.getY();              //get the position of start
            if (event.getAction() == MotionEvent.ACTION_DOWN) {

                path.moveTo(startX,startY); //draw the line from when button clicked
            }

            if(event.getAction()==MotionEvent.ACTION_MOVE)
            {
                path.lineTo(startX,startY);     //draw the line
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {

            }
            return true;
        }

    }
}
