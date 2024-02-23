package com.example.reg_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name1,pass1,num1;
    RadioButton rb1,rb2;

    CheckBox cb1,cb2,cb3;

    Spinner sp1;
    Button reg_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = (EditText)findViewById(R.id.name1);
        pass1 = (EditText)findViewById(R.id.pass1);
        num1 = (EditText)findViewById(R.id.num1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        sp1 = (Spinner) findViewById(R.id.sp1);
        reg_btn = (Button) findViewById(R.id.reg_btn);


    }
    public void func(View V ){
        String name = name1.getText().toString();
        String pass = pass1.getText().toString();
        String num = num1.getText().toString();
        String Gender;
        if(rb2.isChecked()){
            Gender = rb2.getText().toString();
        }else {
            Gender = rb1.getText().toString();
        }
        String interest = "";
        if (cb1.isChecked()){
            interest += cb1.getText().toString() + " ";
        }
        if (cb2.isChecked()){
            interest += cb2.getText().toString() + " ";
        }if (cb3.isChecked()){
            interest += cb3.getText().toString() + " ";
        }
        String cities = sp1.getSelectedItem().toString();
        Toast.makeText(this,(name+" "+pass+" "+num+" "+Gender+" "+interest+" "+cities),Toast.LENGTH_LONG).show();


    }
}