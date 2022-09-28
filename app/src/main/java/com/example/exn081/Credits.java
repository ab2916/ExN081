package com.example.exn081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    Intent gi;
    Button btn;
    String extra;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        btn = findViewById(R.id.btn);
        tv1 = findViewById(R.id.tv1);
        gi = getIntent();
        extra = gi.getStringExtra("193hadorel");
        tv1.setText(extra);
    }

    public void back(View view) {
        finish();
    }
}