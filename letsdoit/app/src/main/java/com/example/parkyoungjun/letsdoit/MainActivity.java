package com.example.parkyoungjun.letsdoit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    TextView textView;
    String[] items ={"mike","angel", "crow", "john", "ginnie", "sally", "cohen", "rice"};
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView = (TextView)findViewById(R.id.textView);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                             textView.setText(items[position]);
                                              }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }

     }


        );
        ListView listView = (ListView) findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this);
        listView.setAdapter(adapter);
    }
}