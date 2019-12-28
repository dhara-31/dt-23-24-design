package com.example.designpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView other, male, female, datetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        other = (TextView) findViewById(R.id.other);
        male = (TextView) findViewById(R.id.male);
        female = (TextView) findViewById(R.id.female);
        datetext = (TextView) findViewById(R.id.datetext);

        EditText et = (EditText) findViewById(R.id.text2);
        et.setTextColor(Color.parseColor("#00ff00"));

        EditText et1 = (EditText) findViewById(R.id.editemail);
        et1.setTextColor(Color.parseColor("#00ff00"));

        EditText et2 = (EditText) findViewById(R.id.editpassword);
        et2.setTextColor(Color.parseColor("#00ff00"));

        other.setOnClickListener(this);
        male.setOnClickListener(this);
        female.setOnClickListener(this);

        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM MM dd, yyyy h:mm a");
        String dateString = sdf.format(date);
        datetext.setText(dateString);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.other:
                other.setTextColor(Color.parseColor("#00ff00"));
                male.setTextColor(Color.parseColor("#D6DBDF"));
                female.setTextColor(Color.parseColor("#D6DBDF"));
                break;


            case R.id.male:
                other.setTextColor(Color.parseColor("#D6DBDF"));
                male.setTextColor(Color.parseColor("#00ff00"));
                female.setTextColor(Color.parseColor("#D6DBDF"));
                break;

            case R.id.female:
                other.setTextColor(Color.parseColor("#D6DBDF"));
                male.setTextColor(Color.parseColor("#D6DBDF"));
                female.setTextColor(Color.parseColor("#00ff00"));
                break;


        }
    }
}
