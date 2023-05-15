package com.example.quizee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity10 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main10);
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
        questionTV.setMovementMethod(new ScrollingMovementMethod());
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
        quizModalArrayList.add(new quizmodal ( " What will be the output of the following Java program?\n" + "1.\t    class variable_scope \n" + "2.\t    {\n" + "3.\t        public static void main(String args[]) \n" + "4.\t        {\n" + "5.\t            int x;\n" + "6.\t            x = 5;\n" + "7.\t            {\n" + "8.\t\t        int y = 6;\n" + "9.\t\t        System.out.print(x + \" \" + y);\n" + "10.\t            }\n" + "11.\t            System.out.println(x + \" \" + y);\n" + "12.\t        } \n" + "13.\t    }\n", "Compilation error", "Runtime error", "5 6 5 6", "5 6 5", "Compilation error"));
        quizModalArrayList.add(new quizmodal ( "What will be the error in the following Java code?\n" + "    byte b = 50;\n" + "    b = b * 50;\n","b cannot contain value 50",  "b cannot contain value 100, limited by its range",  "No error in this code", "* operator has converted b * 50 into int, which can not be converted to byte without casting", "* operator has converted b * 50 into int, which can not be converted to byte without casting"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java program?\n" + "1.\t    class leftshift_operator \n" + "2.\t    {\n" + "3.\t        public static void main(String args[]) \n" + "4.\t        {        \n" + "5.\t             byte x = 64;\n" + "6.\t             int i;\n" + "7.\t             byte y; \n" + "8.\t             i = x << 2;\n" + "9.\t             y = (byte) (x << 2)\n" + "10.\t             System.out.print(i + \" \" + y);\n" + "11.\t        } \n" + "12.\t    }\n", "0 256",  "0 64 ", "256 0", "64 0", "256 0"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java program?\n" + "1.\t    class Output \n" + "2.\t    {\n" + "3.\t        public static void main(String args[])\n" + "4.\t        {\n" + "5.\t            int arr[] = {1, 2, 3, 4, 5};\n" + "6.\t            for ( int i = 0; i < arr.length - 2; ++i)\n" + "7.\t                System.out.println(arr[i] + \" \");\n" + "8.\t        } \n" + "9.\t    }\n", "1 2 3 4 5",  "1 2 3 4",  "1 2",  "1 2 3", "1 2 3"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java code?\n" + "1.\t    class String_demo \n" + "2.\t    {\n" + "3.\t        public static void main(String args[])\n" + "4.\t        {\n" + "5.\t            char chars[] = {'a', 'b', 'c'};\n" + "6.\t            String s = new String(chars);\n" + "7.\t            System.out.println(s);\n" + "8.\t        }\n" + "9.\t   }\n",  "abc",  "a",  "b",  "c", "abc"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java code?\n" + "1.\t    class output \n" + "2.\t    {\n" + "3.\t        public static void main(String args[])\n" + "4.\t        { \n" + "5.\t           String c = \"Hello i love java\";\n" + "6.\t           boolean var;\n" + "7.\t           var = c.startsWith(\"hello\");\n" + "8.\t           System.out.println(var);\n" + "9.\t        }\n" + "10.\t    }\n","0",  "true",  "1", "false","false"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java program?\n" + "1.\t    class output \n" + "2.\t    {\n" + "3.\t        public static void main(String args[])\n" + "4.\t        { \n" + "5.\t           StringBuffer s1 = new StringBuffer(\"Quiz\");\n" + "6.\t           StringBuffer s2 = s1.reverse();\n" + "7.\t           System.out.println(s2);\n" + "8.\t        }\n" + "9.\t    }\n", "QuizziuQ",  "ziuQQuiz",  "Quiz",  "ziuQ", "ziuQ"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java code?\n" + "1.\t    class Output \n" + "2.\t    {\n" + "3.\t        public static void main(String args[]) \n" + "4.\t        {\n" + "5.\t            Integer i = new Integer(257);  \n" + "6.\t            byte x = i.byteValue();\n" + "7.\t            System.out.print(x);\n" + "8.\t        }\n" + "9.\t    }\n",  "257",  "256", "0",  "1", "1"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java code?\n" + "1.\t    class Output \n" + "2.\t    {\n" + "3.\t         public static void main(String args[]) \n" + "4.\t         {\n" + "5.\t             double x = 3.14;  \n" + "6.\t             int y = (int) Math.ceil(x);\n" + "7.\t             System.out.print(y);\n" + "8.\t         }\n" + "9.\t    }\n", "3",  "0",  "4",  "3.0", "4"));
        quizModalArrayList.add(new quizmodal ( "What will be the output of the following Java code snippet?\n" + "1.\t    import java.util.*;\n" + "2.\t    class Arraylists \n" + "3.\t    {\n" + "4.\t        public static void main(String args[]) \n" + "5.\t        {\n" + "6.\t            ArrayLists obj = new ArrayLists();\n" + "7.\t            obj.add(\"A\");\n" + "8.\t            obj.add(\"B\");\n" + "9.\t            obj.add(\"C\");\n" + "10.\t            obj.add(1, \"D\");\n" + "11.\t            System.out.println(obj);\n" + "12.\t        }\n" + "13.\t    }\n",  "[A, D, C]",  "[A, B, C]",  "[A, B, C, D] ",  "[A, D, B, C]", "[A, D, B, C] "));
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
                Intent intent =  new Intent(MainActivity10.this,MainActivity2.class);
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