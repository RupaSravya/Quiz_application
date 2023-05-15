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

public class MainActivity16 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main16);
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
        quizModalArrayList.add(new quizmodal ( "What is the output of the following program?\n" + "\n" + "#include<iostream>\n" + "\n" + "using namespace std;\n" + "class abc { \n" + "   public: \n" + "      static int x; \n" + "      int i; \n" + "\n" + "      abc() {\n" + "         i = ++x;\n" + "      }\n" + "   };\n" + "int abc::x;\n" + "\n" + "main() { \n" + "   abc m, n, p;\n" + "   \n" + "   cout<<m.x<<\" \"<<m.i<<endl;\n" + "}", "3 1", "3 3", "1 1", "1 3", "3 1"));
        quizModalArrayList.add(new quizmodal ( " ‘cin’ is an __","Class",  "Object",  "Package", "Namespace", "Object"));
        quizModalArrayList.add(new quizmodal ( "An exceptio in C++ can be generated using which keywords.", "thrown",  " threw", "throw", "throws", "throw"));
        quizModalArrayList.add(new quizmodal ( "Which of the following correctly declares an array in C++?", "array{10};",  "array array[10];",  "int array;",  "int array[10];", "int array[10];"));
        quizModalArrayList.add(new quizmodal ( "What is the size of wchar_t in C++?",  "Based on the number of bits in the system",  "2 or 4",  "2",  "4", "Based on the number of bits in the system"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following C++ code?\n" + "\n" + "#include<iostream>\n" + "using namespace std;\n" + "int main ()\n" + "{\n" + "   int cin;\n" + "   cin >> cin;\n" + "   cout << \"cin: \" << cin;\n" + "   return 0;\n" + "}","Segmentation fault",  "Nothing is printed",  "Error", "cin: garbage value","cin: garbage value"));
        quizModalArrayList.add(new quizmodal ( "Which of the following is used to terminate the function declaration in C++?", ";",  "]",  ")",  ":", ";"));
        quizModalArrayList.add(new quizmodal ( " Which keyword is used to define the macros in c++?",  "#macro",  "#define", "macro",  "define", "#define"));
        quizModalArrayList.add(new quizmodal ( "What is the correct syntax of accessing a static member of a class in C++?\n" + "\n" + "---------------------------\n" + "Example class:\n" + "class A\n" + "{\n" + "\tpublic:\n" + "\t\tstatic int value;\n" + "}\n" + "---------------------------\n", "A->value",  "A^value",  "A.value",  "A::value", "A::value"));
        quizModalArrayList.add(new quizmodal ( "What is the use of the indentation in c++?",  "r distinguishes between comments and inner data",  " distinguishes between comments and outer data",  "distinguishes between comments and code",  "r distinguishes between comments and outer data", "r distinguishes between comments and outer data"));

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
                Intent intent =  new Intent(MainActivity16.this,MainActivity2.class);
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