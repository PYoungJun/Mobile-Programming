package com.example.parkyoungjun.lab2_11;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText theName;
    public EditText theAge;
    public Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theName = (EditText) findViewById(R.id.editText1);      //Match id with editText1
        theAge = (EditText) findViewById(R.id.editText2);        //Match id with editText2
        button3 = (Button) findViewById(R.id.store);            //Match id with store


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = theName.getText().toString();         //Get the string from theName
                String age = theAge.getText().toString();           //Get the stirng form theAge
                Intent theintent = new Intent(getApplicationContext(), SomeActivity.class);
                theintent.putExtra("Name", name);       //Send the string with theintent
                theintent.putExtra("Age", age);
                startActivity(theintent);
            }
        });
    }
}


