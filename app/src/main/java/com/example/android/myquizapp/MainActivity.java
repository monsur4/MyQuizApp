package com.example.android.myquizapp;

import android.graphics.Typeface;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;
    final int totalNumberOfQuestion = 4;

    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;

    RadioButton rb1_q3;
    RadioButton rb2_q3;
    RadioButton rb3_q3;
    RadioButton rb4_q3;
    RadioButton rb5_q3;

    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.bells_palsy);
        rb2 = findViewById(R.id.bells_phenomenon);
        rb3 = findViewById(R.id.chvostek_sign);

        cb1 = findViewById(R.id.q2_same_frequency_in_children_and_adults);
        cb2 = findViewById(R.id.q2_presents_with_meningism);
        cb3 = findViewById(R.id.q2_presents_with_fits);
        cb4 = findViewById(R.id.q2_csf_shows_protozoites);
        cb5 = findViewById(R.id.q2_chloroquine_is_doc);

        rb1_q3 = findViewById(R.id.q3_head_injury);
        rb2_q3 = findViewById(R.id.q3_birth_injury);
        rb3_q3 = findViewById(R.id.q3_cerebral_infarct);
        rb4_q3 = findViewById(R.id.q3_brain_tumor);
        rb5_q3 = findViewById(R.id.q3_idiopathic);

        ed = findViewById(R.id.q4_radial_nerve);
    }

    public void evaluateResponseOne(View view) {

        //is the current radio button now checked?
        boolean checked_q1 = ((RadioButton)view).isChecked();

        switch (view.getId()) {
            case (R.id.bells_palsy):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb2.setTypeface(null, Typeface.NORMAL);
                    rb3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.bells_phenomenon):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.NORMAL);
                    rb2.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.chvostek_sign):
                if (checked_q1) {
                    rb1.setTypeface(null, Typeface.NORMAL);
                    rb2.setTypeface(null, Typeface.NORMAL);
                    rb3.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                break;
        }

    }

    public void evaluateResponseTwo (View view){
        boolean checked_q3 = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case (R.id.q2_same_frequency_in_children_and_adults):
                if (checked_q3){
                    cb1.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb1.setTypeface(null, Typeface.NORMAL);
                }
                break;

            case (R.id.q2_presents_with_meningism):
                if (checked_q3){
                    cb2.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb2.setTypeface(null, Typeface.NORMAL);
                }
                break;

            case (R.id.q2_presents_with_fits):
                if (checked_q3){
                    cb3.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb3.setTypeface(null, Typeface.NORMAL);
                }
                break;

            case (R.id.q2_csf_shows_protozoites):
                if (checked_q3){
                    cb4.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb4.setTypeface(null, Typeface.NORMAL);
                }
                break;

            case (R.id.q2_chloroquine_is_doc):
                if (checked_q3){
                    cb5.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                else {
                    cb5.setTypeface(null, Typeface.NORMAL);
                }
                break;
        }
    }

    public  void evaluateResponseThree(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case (R.id.q3_head_injury):
                if (checked) {
                    rb1_q3.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb2_q3.setTypeface(null, Typeface.NORMAL);
                    rb3_q3.setTypeface(null, Typeface.NORMAL);
                    rb4_q3.setTypeface(null, Typeface.NORMAL);
                    rb5_q3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.q3_birth_injury):
                if (checked) {
                    rb1_q3.setTypeface(null, Typeface.NORMAL);
                    rb2_q3.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb3_q3.setTypeface(null, Typeface.NORMAL);
                    rb4_q3.setTypeface(null, Typeface.NORMAL);
                    rb5_q3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.q3_cerebral_infarct):
                if (checked) {
                    rb1_q3.setTypeface(null, Typeface.NORMAL);
                    rb2_q3.setTypeface(null, Typeface.NORMAL);
                    rb3_q3.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb4_q3.setTypeface(null, Typeface.NORMAL);
                    rb5_q3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.q3_brain_tumor):
                if (checked) {
                    rb1_q3.setTypeface(null, Typeface.NORMAL);
                    rb2_q3.setTypeface(null, Typeface.NORMAL);
                    rb3_q3.setTypeface(null, Typeface.NORMAL);
                    rb4_q3.setTypeface(null, Typeface.BOLD_ITALIC);
                    rb5_q3.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case (R.id.q3_idiopathic):
                if (checked) {
                    rb1_q3.setTypeface(null, Typeface.NORMAL);
                    rb2_q3.setTypeface(null, Typeface.NORMAL);
                    rb3_q3.setTypeface(null, Typeface.NORMAL);
                    rb4_q3.setTypeface(null, Typeface.NORMAL);
                    rb5_q3.setTypeface(null, Typeface.BOLD_ITALIC);
                }
                break;
        }
    }

    public void questionOne(){
        if (rb1.isChecked()==true)
            totalScore++;
    }

    public void questionTwo(){
        if (cb1.isChecked()==false && cb2.isChecked()==true && cb3.isChecked() ==true && cb4.isChecked()==false && cb5.isChecked()==false){
            totalScore++;
        }
    }

    public void questionThree (){
        if (rb3_q3.isChecked())
            totalScore++;
    }

    public void questionFour(){
        String checkEditTextValue = ed.getText().toString().replaceAll("\\s","" ).toLowerCase();
        if (checkEditTextValue.matches("wristdrop") ){
            totalScore++;
        }
    }

    public void reset (){
        totalScore = 0;
    }

    public void submitButton (View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();

        String toastMessage = "You have scored: " + totalScore + " point out of " + totalNumberOfQuestion + " questions.";
        Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        reset();
    }
}
