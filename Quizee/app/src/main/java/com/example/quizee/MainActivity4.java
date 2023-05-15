package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button b9,b10,b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b9=findViewById(R.id.button7);
        b10=findViewById(R.id.button8);
        b11=findViewById(R.id.button9);

    }
    public void show9(View view)
    {
        Intent i=new Intent(MainActivity4.this,MainActivity11.class);
        startActivity(i);
    }
    public void show10(View view)
    {
        Intent i=new Intent(MainActivity4.this,MainActivity12.class);
        startActivity(i);
    }
    public void show11(View view)
    {
        Intent i=new Intent(MainActivity4.this,MainActivity13.class);
        startActivity(i);
    }
}