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
import android.widget.TextView;

public class registrar extends AppCompatActivity {
     TextView text_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        text_reg = findViewById(R.id.text_reg);

        String text = "Already have an account? Sign In";
        SpannableString spannableString = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Start the new activity here
                Intent intent = new Intent(registrar.this, log_in.class);
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 24, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text_reg.setText(spannableString);
        text_reg.setMovementMethod(LinkMovementMethod.getInstance());


    }
}