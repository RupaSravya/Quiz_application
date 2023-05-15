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

public class MainActivity13 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main13);
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

                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
                option1Btn.setChecked(false);

            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
                option2Btn.setChecked(false);

            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
                option3Btn.setChecked(false);

            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToviews(currentPos);
                option4Btn.setChecked(false);

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
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following C code?\n" + "\n" + "     #include <stdio.h>\n" + "    int main()\n" + "    {\n" + "        int i = 0;\n" + "        do\n" + "        {\n" + "            i++;\n" + "            if (i == 2)\n" + "                continue;\n" + "                printf(\"In while loop \");\n" + "        } while (i < 2);\n" + "        printf(\"%d\\n\", i);\n" + "    }", "In while loop 2", " In while loop in while loop 3", "In while loop 3", "Infinite loop", "In while loop 2"));
        quizModalArrayList.add(new quizmodal ( "scanf() is a predefined function in____header file.","stdlib. h",  "ctype. h",  "stdio. h", "stdarg. h", " stdio. h"));
        quizModalArrayList.add(new quizmodal ( " Which of the following is not an operator in C?", " ,",  "  sizeof()", "~", "None of the mentioned", "None of the mentioned"));
        quizModalArrayList.add(new quizmodal ( "What is the sizeof(char) in a 32-bit C compiler?", "1 bit",  " 2 bits",  "1 Byte",  " 2 Bytes", "1 Byte"));
        quizModalArrayList.add(new quizmodal ( " In C language, FILE is of which data type?",  "int",  "char*",  "struct",  "None of the mentioned", "struct"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following C function?\n" + "\n" + "    #include <stdio.h>\n" + "    enum birds {SPARROW, PEACOCK, PARROT};\n" + "    enum animals {TIGER = 8, LION, RABBIT, ZEBRA};\n" + "    int main()\n" + "    {\n" + "        enum birds m = TIGER;\n" + "        int k;\n" + "        k = m;\n" + "        printf(\"%d\\n\", k);\n" + "        return 0;\n" + "    }","8",  "0",  "Compile time error ", "1","8"));
        quizModalArrayList.add(new quizmodal ( "Where in C the order of precedence of operators do not exist?", "Within conditional statements, if, else",  " Within while, do-while",  "Within a macro definition",  "None of the mentioned", "None of the mentioned"));
        quizModalArrayList.add(new quizmodal ( " Functions in C Language are always ___",  "Internal",  " External", "Both Internal and External",  "External and Internal are not valid terms for functions", "External"));
        quizModalArrayList.add(new quizmodal ( "What is #include <stdio.h>?", " Preprocessor directive",  " Inclusion directive",  "File inclusion directive",  "None of the mentioned", "Preprocessor directive"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following C code?\n" + "\n" + "    #include <stdio.h>\n" + "    int const print()\n" + "    {\n" + "        printf(\"hi\");\n" + "        return 0;\n" + "    }\n" + "    void main()\n" + "    {\n" + "        print();\n" + "    }",  " Error because function name cannot be preceded by const",  "hi",  "hi is printed infinite times",  "Blank screen, no output", "hi"));

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
                Intent intent =  new Intent(MainActivity13.this,MainActivity2.class);
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