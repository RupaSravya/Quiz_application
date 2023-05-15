package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button b15,b16,b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b15=findViewById(R.id.button7);
        b16=findViewById(R.id.button8);
        b17=findViewById(R.id.button9);

    }
    public void show15(View view)
    {
        Intent i=new Intent(MainActivity6.this,MainActivity17.class);
        startActivity(i);
    }
    public void show16(View view)
    {
        Intent i=new Intent(MainActivity6.this,MainActivity18.class);
        startActivity(i);
    }
    public void show17(View view)
    {
        Intent i=new Intent(MainActivity6.this,MainActivity19.class);
        startActivity(i);
    }
}