package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectAnswer1(View view) {
        // Check if correct answer was clicked
        RadioButton Q1Answer = findViewById(R.id.button1C);
        if (Q1Answer.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public void selectAnswer2(View view) {
        // Check if correct answer was clicked
        RadioButton Q2Answer = findViewById(R.id.button2D);
        if (Q2Answer.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public void selectAnswer3(View view) {
        // Check if correct answer was clicked
        RadioButton Q3Answer = findViewById(R.id.button3A);
        if (Q3Answer.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public int checkAnswer4() {
        //Check input for question 4
        EditText Q4Answer = findViewById(R.id.text4);
        String answer4 = Q4Answer.getText().toString();
        answer4 = answer4.replaceAll(" ", "");
        if (answer4.equalsIgnoreCase("simile")) {
            correctAnswers += 1;
        } else {
            correctAnswers += 0;
        }
        return correctAnswers;
    }

    public int checkAnswer5() {
        //Check input for question 5
        EditText Q5Answer = findViewById(R.id.text5);
        String answer5 = Q5Answer.getText().toString();
        answer5 = answer5.replaceAll(" ", "");
        if (answer5.equalsIgnoreCase("personification")) {
            correctAnswers += 1;
        } else {
            correctAnswers += 0;
        }
        return correctAnswers;
    }

    public int checkAnswer6() {
        //Check input for question 6
        EditText Q6Answer = (EditText) findViewById(R.id.text6);
        String answer6 = Q6Answer.getText().toString();
        answer6 = answer6.replaceAll(" ", "");
        if (answer6.equalsIgnoreCase("oxymoron")) {
            correctAnswers += 1;
        } else {
            correctAnswers += 0;
        }
        return correctAnswers;
    }

    public int checkAnswer7() {
        //Check input for question 7
        EditText Q7Answer = (EditText) findViewById(R.id.text7);
        String answer7 = Q7Answer.getText().toString();
        answer7 = answer7.replaceAll(" ", "");
        if (answer7.equalsIgnoreCase("paradox")) {
            correctAnswers += 1;
        } else {
            correctAnswers += 0;
        }
        return correctAnswers;
    }

    public void selectAnswer8(View view) {
        //Check if correct answers were selected
        CheckBox Q8Answer1 = findViewById(R.id.checkbox8A);
        CheckBox Q8Answer2 = (CheckBox) findViewById(R.id.checkbox8C);
        if (Q8Answer1.isChecked() && Q8Answer2.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public void selectAnswer9(View view) {
        //Check if correct answers were selected
        CheckBox Q9Answer1 = findViewById(R.id.checkbox9B);
        CheckBox Q9Answer2 = findViewById(R.id.checkbox9D);
        if (Q9Answer1.isChecked() && Q9Answer2.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public void selectAnswer10(View view) {
        //Check if correct answers were selected
        CheckBox Q10Answer1 = findViewById(R.id.checkbox10C);
        CheckBox Q10Answer2 = findViewById(R.id.checkbox10D);
        if (Q10Answer1.isChecked() && Q10Answer2.isChecked())
            correctAnswers += 1;
        else
            correctAnswers += 0;
    }

    public void submitAnswers(View view) {
        checkAnswer4();
        checkAnswer5();
        checkAnswer6();
        checkAnswer7();
        findViewById(R.id.button1A).setClickable(false);
        findViewById(R.id.button1B).setClickable(false);
        findViewById(R.id.button1C).setClickable(false);
        findViewById(R.id.button1D).setClickable(false);
        findViewById(R.id.button2A).setClickable(false);
        findViewById(R.id.button2B).setClickable(false);
        findViewById(R.id.button2C).setClickable(false);
        findViewById(R.id.button2D).setClickable(false);
        findViewById(R.id.button3A).setClickable(false);
        findViewById(R.id.button3B).setClickable(false);
        findViewById(R.id.button3C).setClickable(false);
        findViewById(R.id.button3D).setClickable(false);
        findViewById(R.id.text4).setEnabled(false);
        findViewById(R.id.text5).setEnabled(false);
        findViewById(R.id.text6).setEnabled(false);
        findViewById(R.id.text7).setEnabled(false);
        findViewById(R.id.checkbox8A).setClickable(false);
        findViewById(R.id.checkbox8B).setClickable(false);
        findViewById(R.id.checkbox8C).setClickable(false);
        findViewById(R.id.checkbox8D).setClickable(false);
        findViewById(R.id.checkbox9A).setClickable(false);
        findViewById(R.id.checkbox9B).setClickable(false);
        findViewById(R.id.checkbox9C).setClickable(false);
        findViewById(R.id.checkbox9D).setClickable(false);
        findViewById(R.id.checkbox10A).setClickable(false);
        findViewById(R.id.checkbox10B).setClickable(false);
        findViewById(R.id.checkbox10C).setClickable(false);
        findViewById(R.id.checkbox10D).setClickable(false);

        Toast result = Toast.makeText(MainActivity.this, "YOUR SCORE: " + correctAnswers + " OUT OF 10.", Toast.LENGTH_LONG);
        result.setGravity(Gravity.CENTER, 8, 9);
        result.show();

        correctAnswers = 0;
    }
}
