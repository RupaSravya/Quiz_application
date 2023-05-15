package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        b5=findViewById(R.id.button6);
    }
    public void show1(View view)
    {
        Intent i=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(i);
    }
    public void show2(View view)
    {
        Intent i=new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(i);
    }
    public void show3(View view)
    {
        Intent i=new Intent(MainActivity2.this,MainActivity5.class);
        startActivity(i);
    }
    public void show4(View view)
    {
        Intent i=new Intent(MainActivity2.this,MainActivity6.class);
        startActivity(i);
    }
    public void show5(View view)
    {
        Intent i=new Intent(MainActivity2.this,MainActivity7.class);
        startActivity(i);
    }
}
