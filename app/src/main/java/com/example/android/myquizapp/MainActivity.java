package com.example.android.myquizapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cb1 = findViewById(R.id.q2_same_frequency_in_children_and_adults);
        this.cb1 = cb1;
        CheckBox cb2 = findViewById(R.id.q2_presents_with_meningism);
        this.cb2 = cb2;
        CheckBox cb3 = findViewById(R.id.q2_presents_with_fits);
        this.cb3 = cb3;
        CheckBox cb4 = findViewById(R.id.q2_csf_shows_protozoites);
        this.cb4 = cb4;
        CheckBox cb5 = findViewById(R.id.q2_chloroquine_is_doc);
        this.cb5 = cb5;
    }
    int totalScore = 0;
    final int totalNumberOfQuestion = 4;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;



    public void evaluateResponse(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.bells_palsy);
        RadioButton rb2 = (RadioButton) findViewById(R.id.bells_phenomenon);
        RadioButton rb3 = (RadioButton) findViewById(R.id.chvostek_sign);

        totalScore = 0;
        int score = 0;

        //is the current radio button now checked?
        boolean checked_q1 = ((RadioButton)view).isChecked();

        switch (view.getId()) {
            case (R.id.bells_palsy):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb2.setTypeface(null, Typeface.NORMAL);
                    rb3.setTypeface(null, Typeface.NORMAL);
                }
                score = 1;
                break;
            case (R.id.bells_phenomenon):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.NORMAL);
                    rb2.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb3.setTypeface(null, Typeface.NORMAL);
                }
                score = 0;
                break;
            case (R.id.chvostek_sign):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.NORMAL);
                    rb2.setTypeface(null, Typeface.NORMAL);
                    rb3.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                score = 0;
                break;
        }
        totalScore = totalScore + score;

    }

    public void evalauteQuestionThree (View view){
        boolean checked_q3 = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case (R.id.q2_same_frequency_in_children_and_adults):
                if (checked_q3){
                    cb1.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb1.setTypeface(null, Typeface.NORMAL);
                }

            case (R.id.q2_presents_with_meningism):
                if (checked_q3){
                    cb2.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb2.setTypeface(null, Typeface.NORMAL);
                }
            case (R.id.q2_presents_with_fits):
                if (checked_q3){
                    cb3.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb3.setTypeface(null, Typeface.NORMAL);
                }
            case (R.id.q2_csf_shows_protozoites):
                if (checked_q3){
                    cb4.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb4.setTypeface(null, Typeface.NORMAL);
                }
            case (R.id.q2_chloroquine_is_doc):
                if (checked_q3){
                    cb5.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb5.setTypeface(null, Typeface.NORMAL);
                }
        }
    }

    public void questionThree (){

        if (cb1.isChecked()==false && cb2.isChecked()==true && cb3.isChecked() ==true && cb4.isChecked()==false && cb5.isChecked()==false){
            totalScore++;
        }
    }

    public void reset (){
        totalScore = 0;
    }

    public void submitButton (View view) {
        questionThree();

        String toastMessage = "You have scored: " + totalScore + " point out of " + totalNumberOfQuestion + " questions.";
        Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        reset();
    }
}
