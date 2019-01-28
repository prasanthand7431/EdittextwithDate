package com.example.gspl.mainproject;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity
{
    EditText editText;
    RadioGroup radiogp;
    String s;
    Button date;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogp=findViewById(R.id.rdgp);

        radiogp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=radiogp.getCheckedRadioButtonId();
                if(i==R.id.rdb1)
                {
                    s=s+"Yes";

                }
                else
                {
                    s=s+"No";
                }
                Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();
            }

        });


    }

    public void dates(View view) {


        date = (Button) findViewById(R.id.but1);
        date.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                    }
                }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });



    }
}
