package com.example.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvTitle = findViewById(R.id.title);
        tvTitle.setText(getIntent().getStringExtra("title"));
        TextView tvContent = findViewById(R.id.content);
        tvContent.setText(getIntent().getStringExtra("content"));
    }
}
