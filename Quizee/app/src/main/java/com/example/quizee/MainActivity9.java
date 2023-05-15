package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity9 extends AppCompatActivity {
    private TextView questionTV, questionNumberTV;
    LinearLayout bottomSheetview;
    private RadioButton option1Btn, option2Btn, option3Btn, option4Btn;
    Button restartQuiz8tn;
    private ArrayList<quizmodal> quizModalArrayList;
    Random random;
    int currentScore = 0, questionAttempted = 1;
    int currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        questionTV = findViewById(R.id.textView3);
        questionNumberTV = findViewById(R.id.textView4);
        option1Btn = findViewById(R.id.radioButton5);
        option2Btn = findViewById(R.id.radioButton6);
        option3Btn = findViewById(R.id.radioButton7);
        option4Btn = findViewById(R.id.radioButton8);
        restartQuiz8tn = findViewById(R.id.restartButton);
        bottomSheetview = findViewById(R.id.idllscore);
        //scoreTV = findViewById(R.id.idTVscore);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToviews(currentPos);
        //questionTV.getMovementMethod(new ScrollingMovementMethod());
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option1Btn.setChecked(false);
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option2Btn.setChecked(false);
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option3Btn.setChecked(false);

                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option4Btn.setChecked(false);

                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
            }
        });
    }

    private void setDataToviews(int currentPos) {
        questionNumberTV.setText("Questions Attempted : " +questionAttempted + "/5");
        if(questionAttempted==5)
        {
            showBottomsheet();
        }
        else
        {
            questionNumberTV.setText("Questions Attempted :"+questionAttempted + "/5");
            questionTV.setText(quizModalArrayList.get(currentPos).getQuestions());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn. setText(quizModalArrayList.get(currentPos).getOption4());
        }
    }

    private void getQuizQuestion(ArrayList<quizmodal> quizModalArrayList)
    {
        quizModalArrayList.add(new quizmodal ( "Find the output of the following code.\n" + "int ++a = 100;\n" + "System.out.println(++a);\n", "101", "Compile error as ++a is not valid identifier", "100", "none", "Compile error as ++a is not valid identifier"));
        quizModalArrayList.add(new quizmodal ( "Which of the following is a valid declaration of a char?","char ch = '\\utea';",  "char ca = 'tea';",  "char cr = \\u0223;", "char cc = '\\itea';", "char ch = '\\utea';"));
        quizModalArrayList.add(new quizmodal ( "Evaluate the following Java expression, if x=3, y=5, and z=10:\n" + "++z + y - y + z + x++\n", "24",  "23 ", "20", "25", "25"));
        quizModalArrayList.add(new quizmodal ( "Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?", "javap tool",  "javaw command",  "Javadoc tool",  "javah command", "Javadoc tool"));
        quizModalArrayList.add(new quizmodal ( "Which of the following creates a List of 3 visible items and multiple selections abled?",  "new List(false, 3)",  "new List(3, true)",  "new List(true, 3)",  "new List(3, false)", "new List(3, true)"));
        quizModalArrayList.add(new quizmodal ( "Which of the following for loop declaration is not valid?","for ( int i = 99; i >= 0; i / 9 )",  "for ( int i = 7; i <= 77; i += 7 )",  "for ( int i = 20; i >= 2; - -i )  ", "for ( int i = 2; i <= 20; i = 2* i )","for ( int i = 99; i >= 0; i / 9 )"));
        quizModalArrayList.add(new quizmodal ( "An interface with no fields or methods is known as a __.", "Runnable Interface",  "Marker Interface",  "Abstract Interface",  "CharSequence Interface", "Marker Interface"));
        quizModalArrayList.add(new quizmodal ( "Which option is false about the final keyword?",  "A final method cannot be overridden in its subclasses.",  "A final class cannot be extended.", "A final class cannot extend other classes.",  "A final method can be inherited.", "A final class cannot extend other classes."));
        quizModalArrayList.add(new quizmodal ( ". If three threads trying to share a single object at the same time, which condition will arise in this scenario?", "Time-Lapse",  "Critical situation",  "Race condition",  "Recursion", "Critical situation"));
        quizModalArrayList.add(new quizmodal ( "Which of the following is used to find and fix bugs in the program?",  " JDK",  "JRE",  "JVM ",  "JDB", "JDB "));

    }

    private void showBottomsheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View bottomSheetview = LayoutInflater.from(getApplicationContext()).inflate(R.layout.scorebottomsheet, findViewById(R.id.idllscore));
        TextView scoreTV = bottomSheetview.findViewById(R.id.idTVscore);
        Button restartQuizBtn = bottomSheetview.findViewById(R.id.restartButton);
        Button backButton = bottomSheetview.findViewById(R.id.button10);
        scoreTV.setText("Your Score is \n" + currentScore + "/5");
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity9.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
                questionAttempted = 1;
                currentScore = 0;
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetview);
        bottomSheetDialog.show();

    }
}