package com.example.android.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    //global variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //getting the status of buttons after submission of quiz

    public void submitQuiz(View view) {

        //name
        EditText editText = (EditText) findViewById(R.id.person_name);
        String name = editText.getText().toString();

        //radiogroup
        RadioGroup groupOne = (RadioGroup) findViewById(R.id.group_1);
        RadioGroup groupTwo = (RadioGroup) findViewById(R.id.group_2);
        RadioGroup groupThree = (RadioGroup) findViewById(R.id.group_3);
        RadioGroup groupFive = (RadioGroup) findViewById(R.id.group_5);


        //question 1
        RadioButton answer11 = (RadioButton) findViewById(R.id.answer11);
        boolean isCheckedAnswer11 = answer11.isChecked();
        RadioButton answer12 = (RadioButton) findViewById(R.id.answer12);
        boolean isCheckedAnswer12 = answer12.isChecked();
        RadioButton answer13 = (RadioButton) findViewById(R.id.answer13);
        boolean isCheckedAnswer13 = answer13.isChecked();
        RadioButton answer14 = (RadioButton) findViewById(R.id.answer14);
        boolean isCheckedAnswer14 = answer14.isChecked();

        //question 2
        RadioButton answer21 = (RadioButton) findViewById(R.id.answer21);
        boolean isCheckedAnswer21 = answer21.isChecked();
        RadioButton answer22 = (RadioButton) findViewById(R.id.answer22);
        boolean isCheckedAnswer22 = answer22.isChecked();
        RadioButton answer23 = (RadioButton) findViewById(R.id.answer23);
        boolean isCheckedAnswer23 = answer23.isChecked();
        RadioButton answer24 = (RadioButton) findViewById(R.id.answer24);
        boolean isCheckedAnswer24 = answer24.isChecked();

        //question 3
        RadioButton answer31 = (RadioButton) findViewById(R.id.answer31);
        boolean isCheckedAnswer31 = answer31.isChecked();
        RadioButton answer32 = (RadioButton) findViewById(R.id.answer32);
        boolean isCheckedAnswer32 = answer32.isChecked();

        //question 4
        CheckBox answer41 = (CheckBox) findViewById(R.id.answer41);
        boolean isCheckedAnswer41 = answer41.isChecked();
        CheckBox answer42 = (CheckBox) findViewById(R.id.answer42);
        boolean isCheckedAnswer42 = answer42.isChecked();
        CheckBox answer43 = (CheckBox) findViewById(R.id.answer43);
        boolean isCheckedAnswer43 = answer43.isChecked();
        CheckBox answer44 = (CheckBox) findViewById(R.id.answer44);
        boolean isCheckedAnswer44 = answer44.isChecked();

        //question 5
        RadioButton answer51 = (RadioButton) findViewById(R.id.answer51);
        boolean isCheckedAnswer51 = answer51.isChecked();
        RadioButton answer52 = (RadioButton) findViewById(R.id.answer52);
        boolean isCheckedAnswer52 = answer52.isChecked();
        RadioButton answer53 = (RadioButton) findViewById(R.id.answer53);
        boolean isCheckedAnswer53 = answer53.isChecked();
        RadioButton answer54 = (RadioButton) findViewById(R.id.answer54);
        boolean isCheckedAnswer54 = answer54.isChecked();

        //answers
        answerOne(isCheckedAnswer11, isCheckedAnswer12, isCheckedAnswer13, isCheckedAnswer14);
        answerTwo(isCheckedAnswer21, isCheckedAnswer22, isCheckedAnswer23, isCheckedAnswer24);
        answerThree(isCheckedAnswer31, isCheckedAnswer32);
        answerFour(isCheckedAnswer41, isCheckedAnswer42, isCheckedAnswer43, isCheckedAnswer44);
        answerFive(isCheckedAnswer51, isCheckedAnswer52, isCheckedAnswer53, isCheckedAnswer54);


        //score
        finalScore(name);

        //resert buttons
        editText.setText(null);
        groupOne.clearCheck();
        groupTwo.clearCheck();
        groupThree.clearCheck();
        groupFive.clearCheck();
        answer41.setChecked(false);
        answer42.setChecked(false);
        answer43.setChecked(false);
        answer44.setChecked(false);

    }

    //logic for first answer
    public void answerOne(boolean a, boolean b, boolean c, boolean d) {
        if (!a && b && !c && !d)
            score += 1;
    }

    //logic for second answer
    public void answerTwo(boolean a, boolean b, boolean c, boolean d) {
        if (!a && b && !c && !d)
            score += 1;
    }

    //logic for third answer
    public void answerThree(boolean a, boolean b) {
        if (a && !b)
            score += 1;
    }

    //logic for fourth answer
    public void answerFour(boolean a, boolean b, boolean c, boolean d) {
        if (!a && b && c && !d)
            score += 1;
    }

    //logic for fifth answer
    public void answerFive(boolean a, boolean b, boolean c, boolean d) {
        if (!a && !b && c && !d)
            score += 1;
    }

    //display score
    public void finalScore(String s) {
        Toast.makeText(this, s + ": Your score is " + score, Toast.LENGTH_SHORT).show();
        score = 0;
    }

}
