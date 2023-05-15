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

public class MainActivity21 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main21);
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
        quizModalArrayList.add(new quizmodal ( "Which tag is used to create a checkbox in HTML?", " <checkbox>", "<Input type = \"checkbox\">", "<cb>", "<Input type = \"checkbox\">", "<Input type = \"checkbox\">"));
        quizModalArrayList.add(new quizmodal ( "Which HTML attribute is used to define styles of an element?","A.<style>",  "<css>",  "C.style", "css", "style"));
        quizModalArrayList.add(new quizmodal ( "Which is the correct HTML statement to define the red color of the paragraph text?", "<p style=\"color: #ff0000;\">",  "<p style=\"color: red;\">  ", "Both A. and B.", "D.None of the above", "C.Both A. and B."));
        quizModalArrayList.add(new quizmodal ( "Which HTML tag is used to define smaller text?", "<normal>",  "<span>",  "<smaller>",  "<small>", "<small>"));
        quizModalArrayList.add(new quizmodal ( "Which HTML tag is used to define marked or highlighted text?",  "<mark>",  "<highlight>",  "<m>",  "<highlighted>", "<mark>"));
        quizModalArrayList.add(new quizmodal ( "Which is the correct HTML statement to display H20 in a paragraph?","<p>H<sup>2</sup>O</p>",  "<p>H<ins>2</ins>O</p>",  "<p>H<below>2</below>O</p>", "<p>H<sub>2</sub>O</p>","<p>H<sub>2</sub>O</p>"));
        quizModalArrayList.add(new quizmodal ( "Which is the correct HTML statement to display HelloWorld in a paragraph?", "<p>Hello<sup>World</sup></p>",  "<p>Hello<top>World</top></p>",  "<p>Hello<sub>World</sub></p>",  "<p>Hello<above>World</above></p>", "<p>Hello<sup>World</sup></p>"));
        quizModalArrayList.add(new quizmodal ( "What is the correct HTML syntax of <abbr> tag?",  "<abbr title=\"abbreviation or acronym\">Text</abbr>",  "<abbr description=\"abbreviation or acronym\">Text</abbr>", "<abbr abbreviation=\"abbreviation or acronym\">Text</abbr>",  "<abbr abbreviation=\"abbreviation or acronym\">Text</abbr>", "<abbr title=\"abbreviation or acronym\">Text</abbr>"));
        quizModalArrayList.add(new quizmodal ( "To which of the following does the class string belong to.", "java.lang",  "java.awt",  ". java.applet",  "java.string", "java.lang"));
        quizModalArrayList.add(new quizmodal ( "What HTML tag is used to define the contact information for the author/owner of a document or an article?",  "<contact>",  "<authorinfo>",  "<address>",  "<address>", "<address>"));
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
                Intent intent =  new Intent(MainActivity21.this,MainActivity2.class);
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
