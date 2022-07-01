package com.example.customadapterusingbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv= (TextView) findViewById(R.id.textViewId);
        img = (ImageView) findViewById(R.id.imageViewId);
        img.setImageResource(getIntent().getExtras().getInt("image"));
        tv.setText(getIntent().getExtras().getString("key1"));


    }
}