package com.example.kiemtradtdd;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        ImageView avatar =(ImageView)findViewById(R.id.hinhpf);
        TextView ten = (TextView)findViewById(R.id.tenpf);
        TextView sdt = (TextView)findViewById(R.id.chuthichpf);
        avatar.setImageResource(intent.getIntExtra("hinhanh",1));
        ten.setText(intent.getStringExtra("name"));
        sdt.setText(intent.getStringExtra("chuthich"));
    }
}