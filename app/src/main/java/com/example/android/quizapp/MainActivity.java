package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showScore(View view) {

        /** Question 1 **/
        EditText Sum = (EditText) findViewById(R.id.q1_edt);
        String FirstAnswerText = String.valueOf(Sum.getText());
        boolean FirstAnswer = false;
        if (FirstAnswerText.equals("64")) {
            FirstAnswer = true;
        }

        /** Question 2 **/
        RadioButton SecondAnswerRadio = (RadioButton) findViewById(R.id.q2_radio);
        boolean SecondAnswer = SecondAnswerRadio.isChecked();

        /** Question 3 **/
        RadioButton ThirdAnswerRadio = (RadioButton) findViewById(R.id.q3_radio);
        boolean ThirdAnswer = ThirdAnswerRadio.isChecked();

        /** Question 4 **/
        EditText simplify = (EditText) findViewById(R.id.q4_edt);
        String FourthAnswerText = String.valueOf(simplify.getText());
        boolean FourthAnswer = false;
        if (FourthAnswerText.equals("11")) {
            FourthAnswer = true;
        }

        /** Question 5 **/
        CheckBox firstCheckbox = (CheckBox) findViewById(R.id.first_checkbox);
        CheckBox secondCheckbox = (CheckBox) findViewById(R.id.second_checkbox);
        CheckBox thirdCheckbox = (CheckBox) findViewById(R.id.third_checkbox);
        CheckBox fourthCheckbox = (CheckBox) findViewById(R.id.fourth_checkbox);

        boolean FifthAnswer1 = firstCheckbox.isChecked();
        boolean FifthAnswer2 = secondCheckbox.isChecked();
        boolean FifthAnswer3 = thirdCheckbox.isChecked();
        boolean FifthAnswer4 = fourthCheckbox.isChecked();

        /** Question 6 **/
        EditText sq_area = (EditText) findViewById(R.id.q6_edt);
        String SixthAnswerText = String.valueOf(sq_area.getText());
        boolean SixthAnswer = false;
        if (SixthAnswerText.equals("35")) {
            SixthAnswer = true;
        }

        /** Question 7 **/
        RadioButton SeventhAnswerRadio = (RadioButton) findViewById(R.id.q7_radio);
        boolean SeventhAnswer = SeventhAnswerRadio.isChecked();

        /** Question 8 **/
        EditText Pi = (EditText) findViewById(R.id.q8_pi_edt);
        String EighthAnswerText = String.valueOf(Pi.getText());
        boolean EighthAnswer = false;
        if (EighthAnswerText.equals("3.1416")) {
            EighthAnswer = true;
        }

        /** Question 9 **/
        RadioButton NinthAnswerRadio = (RadioButton) findViewById(R.id.q9_radio);
        boolean NinthAnswer = NinthAnswerRadio.isChecked();

        /** Question 10 **/
        EditText Perimeter = (EditText) findViewById(R.id.q10_perimeter_edt);
        String TenthAnswerText = String.valueOf(Perimeter.getText());
        boolean TenthAnswer = false;
        if (TenthAnswerText.equals("20")) {
            TenthAnswer = true;
        }

        int score = calculateScore(FirstAnswer, SecondAnswer, ThirdAnswer, FourthAnswer, FifthAnswer1, FifthAnswer2, FifthAnswer3, FifthAnswer4, SixthAnswer, SeventhAnswer, EighthAnswer, NinthAnswer, TenthAnswer);


        /** UserName **/
        EditText username = (EditText) findViewById(R.id.user_name);
        name = String.valueOf(username.getText());

        displayScore(score, name);
    }

    public int calculateScore(boolean firstAnswer, boolean secondAnswer, boolean thirdAnswer, boolean fourthAnswer, boolean fifthAnswer1, boolean fifthAnswer2, boolean fifthAnswer3, boolean fifthAnswer4, boolean sixthAnswer, boolean seventhAnswer, boolean eighthAnswer, boolean ninthAnswer, boolean tenthAnswer) {

        int score = 0;

        if (firstAnswer) {
            score = score + 1;
        }

        if (secondAnswer) {
            score = score + 1;
        }

        if (thirdAnswer) {
            score = score + 1;
        }

        if (fourthAnswer) {
            score = score + 1;
        }

        if (fifthAnswer1 && fifthAnswer3 && !fifthAnswer4 && !fifthAnswer2) {
            score = score + 1;
        }

        if (sixthAnswer) {
            score = score + 1;
        }

        if (seventhAnswer) {
            score = score + 1;
        }

        if (eighthAnswer) {
            score = score + 1;
        }

        if (ninthAnswer) {
            score = score + 1;
        }

        if (tenthAnswer) {
            score = score + 1;
        }

        return score;
    }

    public void displayScore(int score, String name) {
        if (!name.equals("")) {

            if (score == 0) {
                Toast.makeText(this, "Come on, " + name + " ! You scored 0 points! You can do better! Try again! ", Toast.LENGTH_LONG).show();
            } else if (score < 3) {
                Toast.makeText(this, "Not bad, " + name + " ! Your score is: " + score + "/10. You can do better! Try again!", Toast.LENGTH_LONG).show();
            } else if (score == 9) {
                Toast.makeText(this, "You are great " + name + " ! Your score is: " + score + "/10. Only one right answer from being perfect!", Toast.LENGTH_LONG).show();
            } else if (score == 10) {
                Toast.makeText(this, "You are such a genious " + name + " ! Your score is: " + score + "/10. IT'S JUST PERFECT! Congratulations!", Toast.LENGTH_LONG).show();
            } else if (score >= 5) {
                Toast.makeText(this, "Good, " + name + " ! Your score is: " + score + "/10. You answered more than half of the question right!", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this, "You need to enter your name first", Toast.LENGTH_LONG).show();
        }
    }

}
