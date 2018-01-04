package com.example.Math_Champ;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.example.testapp.R;

public class GradeSelection extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_grade_selection);
        questions();
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView7 = (TextView) findViewById(R.id.button3);
        TextView myTextView8 = (TextView) findViewById(R.id.button4);
        TextView myTextView9 = (TextView) findViewById(R.id.button5);
        ((TextView) findViewById(R.id.textView5)).setTypeface(myTypeface);
        myTextView7.setTypeface(myTypeface);
        myTextView8.setTypeface(myTypeface);
        myTextView9.setTypeface(myTypeface);
    }

    public void questions() {
        final Context context3 = this;
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        ((Button) findViewById(R.id.button3)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                GradeSelection.this.startActivity(new Intent(context3, ConfirmationScreen.class));
                MainActivity.gradeLevel = "Level: 1";
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                GradeSelection.this.startActivity(new Intent(context3, ConfirmationScreen.class));
                MainActivity.gradeLevel = "Level: 2";
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                GradeSelection.this.startActivity(new Intent(context3, ConfirmationScreen.class));
                MainActivity.gradeLevel = "Level: 3";
            }
        });
    }
}
