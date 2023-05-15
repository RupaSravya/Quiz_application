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

public class MainActivity20 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main20);
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

    private void getQuizQuestion(ArrayList<quizmodal> quizModalArrayList) {
        quizModalArrayList.add(new quizmodal ( "Which element is used to get highlighted text in HTML5?", "<u>", "<mark>", "<highlight>", "<b>", "<mark>"));
        quizModalArrayList.add(new quizmodal ( "Which of the following is not a HTML5 tag?","<track>",  "<video>",  "<slider>", "<source>", "<slider>"));
        quizModalArrayList.add(new quizmodal ( "How do we write comments in HTML?", "</…….>",  "<!……>   ", "Primitive data type", "None", " Objects"));
        quizModalArrayList.add(new quizmodal ( "Multiple inheritance means,", "one class inheriting from more super classes",  "more classes inheriting from one super class",  "more classes inheriting from more super classes",  "None of the above", "one class inheriting from more super classes"));
        quizModalArrayList.add(new quizmodal ( ".Which statement is not true in java language?",  "A public member of a class can be accessed in all the packages",  "A private member of a class cannot be accessed by the methods of the same class.",  "A private member of a class cannot be accessed from its derived class.",  "A protected member of a class can be accessed from its derived class", "A private member of a class cannot be accessed by the methods of the same class."));
        quizModalArrayList.add(new quizmodal ( "A constructor","Arrays in java are",  ".Object references",  "Objects  ", "Primitive data type","Object references"));
        quizModalArrayList.add(new quizmodal ( "When is the object created with new keyword?", "At run time",  ". At compile time",  "Depends on the code",  "none", "At run time"));
        quizModalArrayList.add(new quizmodal ( "Identify the corrected definition of a package",  "A package is a collection of classes and interfaces",  "A package is a collection of editing tools", "A package is a collection of classes",  "A package is a collection of interfaces", "A package is a collection of classes and interfaces"));
        quizModalArrayList.add(new quizmodal ( ".To which of the following does the class string belong to.", "java.lang",  "java.awt",  ". java.applet",  "java.string", "java.lang"));
        quizModalArrayList.add(new quizmodal ( ".Identify the return type of a method that does not return any value.",  " int",  "void",  "double",  "none", "void "));
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
                Intent intent =  new Intent(MainActivity20.this,MainActivity2.class);
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
