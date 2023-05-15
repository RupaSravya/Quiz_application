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

public class MainActivity19 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main19);
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
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Python code?\n" + "\n" + "print(\"Hello {0[0]} and {0[1]}\".format(('foo', 'bin')))", "Hello (‘foo’, ‘bin’) and (‘foo’, ‘bin’)", "Error", "Hello foo and bin", "None of the mentioned", "Hello foo and bin"));
        quizModalArrayList.add(new quizmodal ( "Which of the following declarations is incorrect in python language?","xyzp = 5,000,000",  "x y z p = 5000 6000 7000 8000",  "x,y,z,p = 5000, 6000, 7000, 8000", "x_y_z_p = 5,000,000", "x y z p = 5000 6000 7000 8000"));
        quizModalArrayList.add(new quizmodal ( "Which of the following operators is the correct option for power(ab)?", " a ^ b",  " a*b", "a ^ * b", "a ^ ^ b", "a*b"));
        quizModalArrayList.add(new quizmodal ( "Which one of the following syntax is the correct syntax to read from a simple text file stored in ''d:\\java.txt''?", "Infile = open(''d:\\java.txt'', ''r'')",  "Infile = open(file=''d:\\\\java.txt'', ''r'')",  "Infile = open(''d:\\java.txt'',''r'')",  "Infile = open.file(''d:\\\\java.txt'',''r'')", "Infile = open(''d:\\java.txt'', ''r'')"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of this program?",  "['XX', 'YY']",  "['xx', 'yy']",  "[XX, yy]",  "None of these", "['XX', 'YY']"));
        quizModalArrayList.add(new quizmodal ( "Study the following code:\n" + "\n" + ">>>\"javatpoint\"[5:]  \n" + "What will be the output of this code?","javatpoint",  "java",  "point", "None of these","point"));
        quizModalArrayList.add(new quizmodal ( " Study the following statements:\n" + "\n" + ">>> print(0xA + 0xB + 0xC)  \n" + "What will be the output of this statement?", "33",  "63",  "0xA + 0xB + 0xC",  "None of these", "33"));
        quizModalArrayList.add(new quizmodal ( "What happens when '2' == 2 is executed?",  "False",  "Ture", "ValueError occurs",  "TypeError occurs", "False"));
        quizModalArrayList.add(new quizmodal ( "Which of the following precedence order is correct in Python?", "Parentheses, Exponential, Multiplication, Division, Addition, Subtraction",  "Multiplication, Division, Addition, Subtraction, Parentheses, Exponential",  "Division, Multiplication, Addition, Subtraction, Parentheses, Exponential",  "Exponential, Parentheses, Multiplication, Division, Addition, Subtraction", "Parentheses, Exponential, Multiplication, Division, Addition, Subtraction"));
        quizModalArrayList.add(new quizmodal ( "Which of the following functions is a built-in function in python language?",  "val()",  "print()",  "get()",  "None of these", "print()"));

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
                Intent intent =  new Intent(MainActivity19.this,MainActivity2.class);
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
