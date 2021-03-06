package com.example.parkyoungjun.letsdoit;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyAdapter extends BaseAdapter {
    public String[] names= {"LEE","CHOI","KIM","JEONG","RHO"};

    Context mContext;
    public MyAdapter(Context context) {
        mContext = context;
    }
        @Override
                public int getCount(){
            return names.length;
        }

    @Override
    public Object getItem(int position) {
        return names[position];
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        TextView view = new TextView(mContext);
        view.setText(names[position]);
        view.setTextColor(Color.BLUE);
        return view;

    }

}
