package com.example.mydesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);


        text1.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview_background));
        text2.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        text1.setTextColor(Color.parseColor("#FFFEFD"));
        text2.setTextColor(Color.parseColor("#E45A3D"));




    }

    public void data_text2(View view) {

        text2.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview_corner));
        text1.setBackgroundDrawable(getResources().getDrawable(R.drawable.border2));

        text1.setTextColor(Color.parseColor("#E45A3D"));
        text2.setTextColor(Color.parseColor("#FFFEFD"));
    }




    public void data_text1(View view) {

        text1.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview_background));
        text2.setBackgroundDrawable(getResources().getDrawable(R.drawable.border));

        text1.setTextColor(Color.parseColor("#FFFEFD"));
        text2.setTextColor(Color.parseColor("#E45A3D"));
    }
}

