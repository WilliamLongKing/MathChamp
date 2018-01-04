package com.example.Math_Champ;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.testapp.R;

public class ConfirmationScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_confirmation_screen);
        confirmNames();
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView28 = (TextView) findViewById(R.id.textView12);
        TextView myTextView29 = (TextView) findViewById(R.id.textView13);
        TextView myTextView30 = (TextView) findViewById(R.id.button20);
        TextView myTextView32 = (TextView) findViewById(R.id.textView16);
        ((TextView) findViewById(R.id.textView11)).setTypeface(myTypeface);
        myTextView28.setTypeface(myTypeface);
        myTextView29.setTypeface(myTypeface);
        myTextView30.setTypeface(myTypeface);
        myTextView32.setTypeface(myTypeface);
        go();
    }

    public void go() {
        final Context context4 = this;
        ((Button) findViewById(R.id.button20)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(context4, Questions.class);
                MainActivity.questionCounter = Integer.valueOf(0);
                MainActivity.rightCount = Integer.valueOf(0);
                MainActivity.wrongCount = Integer.valueOf(0);
                MainActivity.skipCount = Integer.valueOf(0);
                ConfirmationScreen.this.startActivity(intent4);
            }
        });
        ((ImageButton) findViewById(R.id.imageButton)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ConfirmationScreen.this.startActivity(new Intent(context4, Instructions.class));
            }
        });
    }

    public void confirmNames() {
        TextView gradeText = (TextView) findViewById(R.id.textView13);
        ((TextView) findViewById(R.id.textView12)).setText(MainActivity.activityMode);
        gradeText.setText(MainActivity.gradeLevel);
    }
}
