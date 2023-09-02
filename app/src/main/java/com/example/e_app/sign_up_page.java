package com.example.e_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up_page extends AppCompatActivity {
    LinearLayout signIn_btn;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);


        signIn_btn = findViewById(R.id.signIn_btn);
        textView = findViewById(R.id.textView);




//        Spannable wordtoSpan = new SpannableString("Already have an account? Sign In");
//        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLUE), 24, 32, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            textView.setText(wordtoSpan);


        String text = "Already have an account? Sign In";
        SpannableString spannableString = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Start the new activity here
                Intent intent = new Intent(sign_up_page.this, log_in.class);
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 24, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}