package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button b18,b19,b20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b18=findViewById(R.id.button7);
        b19=findViewById(R.id.button8);
        b20=findViewById(R.id.button9);

    }
    public void show18(View view)
    {
        Intent i=new Intent(MainActivity7.this,MainActivity20.class);
        startActivity(i);
    }
    public void show19(View view)
    {
        Intent i=new Intent(MainActivity7.this,MainActivity21.class);
        startActivity(i);
    }
    public void show20(View view)
    {
        Intent i=new Intent(MainActivity7.this,MainActivity22.class);
        startActivity(i);
    }
}