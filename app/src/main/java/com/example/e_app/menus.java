package com.example.e_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class menus extends AppCompatActivity{
   TextView textdate,datetext;
   ImageView home,shop,win,profile;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        textdate=findViewById(R.id.textdate);
        home=findViewById(R.id.home);
        shop=findViewById(R.id.shop);
        win=findViewById(R.id.win);
        profile=findViewById(R.id.profile);

shop.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
            Intent intent = new Intent(menus.this, shop.class);
      startActivity(intent);
    }
});
        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menus.this, win.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menus.this, profile.class);
                startActivity(intent);
            }
        });


        SimpleDateFormat time = new SimpleDateFormat(" HH:mm:ss z");
        String currentTime = time.format(new Date());
        textdate.setText(currentTime);
//        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd G");
//        String currentDate = date.format(new Date());
//        datetext.setText(currentDate);

    }


//if(view.getId()==R.id.home){

//}







}