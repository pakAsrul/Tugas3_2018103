package com.example.tugas3_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Balava (View view){
        Intent b = new Intent(MainActivity.this, Balava.class);
        startActivity(b);
    }
    public void solaris (View view){
        Intent b = new Intent(MainActivity.this, solaris.class);
        startActivity(b);
    }
    public void ijen (View view){
        Intent b = new Intent(MainActivity.this, ijen.class);
        startActivity(b);
    }


}