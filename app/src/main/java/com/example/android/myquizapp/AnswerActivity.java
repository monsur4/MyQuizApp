package com.example.android.myquizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        //select the correct answers and implement their styling
        RadioButton answer_q1 = findViewById(R.id.bells_palsy);
        answer_q1.setChecked(true);
        answer_q1.setTypeface(null, Typeface.BOLD_ITALIC);
        answer_q1.setTextColor(getResources().getColor(R.color.green));

        CheckBox answer_q2_b = findViewById(R.id.q2_presents_with_meningism);
        CheckBox answer_q2_c = findViewById(R.id.q2_presents_with_fits);
        answer_q2_b.setChecked(true);
        answer_q2_b.setTypeface(null, Typeface.BOLD_ITALIC);
        answer_q2_b.setTextColor(getResources().getColor(R.color.green));
        answer_q2_c.setChecked(true);
        answer_q2_c.setTypeface(null, Typeface.BOLD_ITALIC);
        answer_q2_c.setTextColor(getResources().getColor(R.color.green));

        RadioButton answer_q3 = findViewById(R.id.q3_cerebral_infarct);
        answer_q3.setChecked(true);
        answer_q3.setTypeface(null, Typeface.BOLD_ITALIC);
        answer_q3.setTextColor(getResources().getColor(R.color.green));

        EditText answer_q4 = findViewById(R.id.q4_radial_nerve);
        answer_q4.setText("Wrist drop");
        answer_q4.setTypeface(null, Typeface.BOLD_ITALIC);
        answer_q4.setTextColor(getResources().getColor(R.color.green));

    }

    public void feedback (View view){
        String url = "http://bit.ly/2H2PpyZ";
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url));

        if (fb.resolveActivity(getPackageManager()) != null){
            startActivity(fb);
        }
        else {
            Toast noBrowser = Toast.makeText(this, "You will need to install a browser to be able to provide a feedback", Toast.LENGTH_LONG);
            noBrowser.show();
        }
    }

    public void supportUs (View view){
        String url = "http://bit.ly/2EXeXgA";
        Intent su = new Intent(Intent.ACTION_VIEW);
        su.setData(Uri.parse(url));

        if (su.resolveActivity(getPackageManager()) != null){
            startActivity(su);
        }
        else {
            Toast noBrowser = Toast.makeText(this, "You will need to install a browser to be able to fill the form", Toast.LENGTH_LONG);
            noBrowser.show();
        }
    }
}
