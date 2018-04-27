package com.example.parkyoungjun.lab3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {       //make objects


    EditText editText;
    RadioGroup radGender;
    RadioButton goMale;
    RadioButton goFemale;
    CheckBox ckSMS;
    CheckBox ckEmail;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {            //match the object
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        radGender=(RadioGroup)findViewById(R.id.rGroupGender);
        goMale=(RadioButton)findViewById(R.id.rMale);
        goFemale=(RadioButton)findViewById(R.id.rFemale);
        ckSMS=(CheckBox)findViewById(R.id.ckSMS);
        ckEmail=(CheckBox)findViewById(R.id.ckEmail);
        button=(Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),AnotherActivity.class);
                String name =editText.getText().toString();
                Bundle bundle1=new Bundle();

                bundle1.putString("name",name);     //put name to bundle


                int radioId = radGender.getCheckedRadioButtonId();
                if(goMale.getId()==radioId)

                    bundle1.putString("gender","남");
                if(goFemale.getId()==radioId)

                    bundle1.putString("gender","여");


                if(ckSMS.isChecked())           //put string in bundle

                    bundle1.putString("send","SNS");
                if(ckEmail.isChecked())
                    bundle1.putString("send","E-mail");

                intent.putExtras(bundle1);                      //put bundle in intent

                startActivity(intent);
            }

        });
    }
}
