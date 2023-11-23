package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button openActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        openActivity = (Button) findViewById(R.id.button);
    }

    public void openActivity2 (View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}