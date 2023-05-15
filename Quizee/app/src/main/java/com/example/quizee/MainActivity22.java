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

public class MainActivity22 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main22);
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
        quizModalArrayList.add(new quizmodal ( "Which tag is used to define ordered listing?", "<ol> ... </ol>", "<ul> ... </ul>", "<list> ... </list>", "<li> ... </li>", "<ol> ... </ol>"));
        quizModalArrayList.add(new quizmodal ( "Which tag is used to define unordered listing?","<ol> ... </ol>",  "t<ul> ... </ul>",  "<list> ... </list>>", "<ul> ... </ul>", "<ul> ... </ul>"));
        quizModalArrayList.add(new quizmodal ( "Which tag is a block-level element?", "<block> ... </block>",  "<b> ... </b>  ", "<div> ... </div>", "<div> ... </div>", "<div> ... </div>"));
        quizModalArrayList.add(new quizmodal ( "What is the correct syntax for <iframe> tag?", "<iframe href=\"url\" title=\"description\"></iframe>",  "<iframe link=\"url\" title=\"description\"></iframe>",  "<iframe src=\"url\" title=\"description\"></iframe>",  "<iframe src=\"url\" title=\"description\"></iframe>", "<iframe src=\"url\" title=\"description\"></iframe>"));
        quizModalArrayList.add(new quizmodal ( "Which tag is used to display a single-line text input field?",  "<input type=\"textbox\">",  "<input type=\"checkbox\">",  "<input type=\"text\">",  "D.\t<input type=\"submit\">", "<input type=\"text\">"));
        quizModalArrayList.add(new quizmodal ( "Which tag is used to display a clickable button?","<input type=\"submit\">",  "<input type=\"checkbox\">",  "Objects  ", "<input type=\"text\">","<input type=\"Button\">"));
        quizModalArrayList.add(new quizmodal ( "Which tag is used to display a horizonal rule (horizonal line)?", "<br>",  "<hr>",  "<hr>...</hr>",  "<line>", "<hr>"));
        quizModalArrayList.add(new quizmodal ( "In which part of the HTML metadata is contained?",  "head tag",  " title tag", "html tag",  "html tag", " head tag"));
        quizModalArrayList.add(new quizmodal ( "Which HTML tag is used to insert an image?", "mg url=”htmllogo.jpg” />",  "<img alt=”htmllogo.jpg” />",  "<img src=”htmllogo.jpg” />",  "<img link=”htmllogo.jpg” />", "<img src=”htmllogo.jpg” />"));
        quizModalArrayList.add(new quizmodal ( " In HTML, which attribute is used to create a link that opens in a new window tab?",  " src=”_blank”",  "alt=”_blank”",  "target=”_self”",  "target=”_blank”", "target=”_blank”"));
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
                Intent intent =  new Intent(MainActivity22.this,MainActivity2.class);
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