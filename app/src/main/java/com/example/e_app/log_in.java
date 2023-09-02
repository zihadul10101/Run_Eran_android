package com.example.e_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class log_in extends AppCompatActivity {

    TextView reg_textview;
    Button log_in_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        reg_textview=findViewById(R.id.reg_textview);
        log_in_btn = findViewById(R.id.log_in_btn);


        // click login btn and show home menu
        log_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(log_in.this, menus.class);
                startActivity(intent);
            }
        });
        String text = "New User? Sign Up";
        SpannableString spannableString = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Start the new activity here
                Intent intent = new Intent(log_in.this, registrar.class);
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 10, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        reg_textview.setText(spannableString);
        reg_textview.setMovementMethod(LinkMovementMethod.getInstance());
    }



}