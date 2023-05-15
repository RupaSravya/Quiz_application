package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button b12,b13,b14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b12=findViewById(R.id.button7);
        b13=findViewById(R.id.button8);
        b14=findViewById(R.id.button9);

    }
    public void show12(View view)
    {
        Intent i=new Intent(MainActivity5.this,MainActivity14.class);
        startActivity(i);
    }
    public void show13(View view)
    {
        Intent i=new Intent(MainActivity5.this,MainActivity15.class);
        startActivity(i);
    }
    public void show14(View view)
    {
        Intent i=new Intent(MainActivity5.this,MainActivity16.class);
        startActivity(i);
    }
}