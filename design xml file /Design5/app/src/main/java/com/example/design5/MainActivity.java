package com.example.design5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView dog1, dog2, dog3, dog4;

    TextView text;
    Boolean s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        dog1 = (ImageView) findViewById(R.id.d1);
        dog2 = (ImageView) findViewById(R.id.d2);
        dog3 = (ImageView) findViewById(R.id.d3);
        dog4 = (ImageView) findViewById(R.id.d4);
        text = (TextView) findViewById(R.id.text);

        dog1.setOnClickListener(this);
        dog2.setOnClickListener(this);
        dog3.setOnClickListener(this);
        dog4.setOnClickListener(this);


        Spinner spinner = findViewById(R.id.spi1);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mr");
        arrayList.add("Mrs");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.d1:

                dog1.setColorFilter(Color.parseColor("#990000"));
                dog2.setColorFilter(Color.parseColor("#ffa329"));
                dog3.setColorFilter(Color.parseColor("#ffa329"));
                dog4.setColorFilter(Color.parseColor("#ffa329"));
                break;


            case R.id.d2:

                dog2.setColorFilter(Color.parseColor("#990000"));
                dog1.setColorFilter(Color.parseColor("#ffa329"));
                dog3.setColorFilter(Color.parseColor("#ffa329"));
                dog4.setColorFilter(Color.parseColor("#ffa329"));

                break;
            case R.id.d3:

                dog3.setColorFilter(Color.parseColor("#990000"));
                dog2.setColorFilter(Color.parseColor("#ffa329"));
                dog1.setColorFilter(Color.parseColor("#ffa329"));
                dog4.setColorFilter(Color.parseColor("#ffa329"));
                break;

            case R.id.d4:

                dog4.setColorFilter(Color.parseColor("#990000"));
                dog2.setColorFilter(Color.parseColor("#ffa329"));
                dog3.setColorFilter(Color.parseColor("#ffa329"));
                dog1.setColorFilter(Color.parseColor("#ffa329"));
                break;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private boolean s1;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void checkCondition(View view)

    {
        if(s1) {
            // reset background to default;
            text.setBackgroundDrawable(getDrawable(R.drawable.uncheck1));
            Log.e("TAG", "text_data: ======" );
        } else {
            text.setBackgroundDrawable(getDrawable(R.drawable.check));
            Log.e("TAG", "text_data: ++++" );
        }
        s1 = !s1;


    }


   /* @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void checkCondition(View view) {


        if(s == true) {
            // reset background to default;
            text.setBackgroundDrawable(getDrawable(R.drawable.uncheck1));
            Log.e("TAG", "text_data: ======" );
        } else {
            text.setBackgroundDrawable(getDrawable(R.drawable.check));
            Log.e("TAG", "text_data: ++++" );
        }
        s = !s;



    }*/
}
