package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b6=findViewById(R.id.button7);
        b7=findViewById(R.id.button8);
        b8=findViewById(R.id.button9);
        Intent in=getIntent();

    }
    public void show6(View view)
    {
        Intent i=new Intent(MainActivity3.this,MainActivity8.class);
        startActivity(i);
    }
    public void show7(View view)
    {
        Intent i=new Intent(MainActivity3.this,MainActivity9.class);
        startActivity(i);
    }
    public void show8(View view)
    {
        Intent i=new Intent(MainActivity3.this,MainActivity10.class);
        startActivity(i);
    }
}
