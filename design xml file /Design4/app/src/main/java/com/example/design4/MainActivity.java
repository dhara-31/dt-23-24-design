package com.example.design4;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12;
    ImageView img, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14;
    LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        text = findViewById(R.id.tex);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text10 = findViewById(R.id.text10);
        text11 = findViewById(R.id.text11);
        text12 = findViewById(R.id.text12);

        img = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img10 = findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img13 = findViewById(R.id.img13);
        img14 = findViewById(R.id.img14);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);
        l6 = findViewById(R.id.l6);
        l7 = findViewById(R.id.l7);
        l8 = findViewById(R.id.l8);
        l9 = findViewById(R.id.l9);
        l10 = findViewById(R.id.l10);
        l11 = findViewById(R.id.l11);
        l12 = findViewById(R.id.l12);
        l13 = findViewById(R.id.l13);
        l14 = findViewById(R.id.l14);

        /*img.setImageDrawable();*/

       /* l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);
        l6.setOnClickListener(this);
        l7.setOnClickListener(this);
        l8.setOnClickListener(this);
        l9.setOnClickListener(this);
        l10.setOnClickListener(this);
        l11.setOnClickListener(this);
        l12.setOnClickListener(this);
        l13.setOnClickListener(this);
        l14  .setOnClickListener(this);
*/
       /* text.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text2.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text3.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text4.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text5.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text6.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text7.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text8.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text9.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text10.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text11.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        text12.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
*/


        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        final LinearLayout content = (LinearLayout) findViewById(R.id.linear);

        ImageView clickbutton = (ImageView) findViewById(R.id.drawerclickbutton);
        clickbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (!drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout.openDrawer(Gravity.RIGHT);
                } else {
                    drawerLayout.closeDrawer(Gravity.RIGHT);
                }
            }
        });


        drawerLayout.setScrimColor(Color.TRANSPARENT);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close) {

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                float slideX = drawerView.getWidth() * slideOffset;
                content.setTranslationX(-slideX);

            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

    }

   /* @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.l1:
                img.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img2.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;


            case R.id.l2:
                img2.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;


            case R.id.l3:
                img3.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img4.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img5.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img6.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img7.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l4:
                img4.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img3.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img5.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img6.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img7.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l5:
                img5.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img4.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img3.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img6.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img7.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l6:
                img6.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img4.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img5.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img3.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img7.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l7:
                img7.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img4.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img5.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img6.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img3.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l8:
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;


            case R.id.l9:
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l10:
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l11:
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l12:
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l13:
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;

            case R.id.l14:
                img14.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_check_black_24dp));
                img9.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img10.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img11.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img12.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img13.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                img8.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.uncheck));
                break;
        }
    }*/
}
