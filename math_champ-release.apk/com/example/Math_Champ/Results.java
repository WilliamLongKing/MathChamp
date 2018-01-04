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

public class Results extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_results);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView18 = (TextView) findViewById(R.id.textView18);
        TextView myTextView19 = (TextView) findViewById(R.id.textView19);
        TextView myTextView20 = (TextView) findViewById(R.id.textView20);
        TextView myTextView21 = (TextView) findViewById(R.id.textView21);
        Button Button1 = (Button) findViewById(R.id.button21);
        ((TextView) findViewById(R.id.textView17)).setTypeface(myTypeface);
        myTextView18.setTypeface(myTypeface);
        myTextView19.setTypeface(myTypeface);
        myTextView20.setTypeface(myTypeface);
        myTextView21.setTypeface(myTypeface);
        Button1.setTypeface(myTypeface);
        modifyResults();
        quit();
    }

    public void modifyResults() {
        TextView wrongText = (TextView) findViewById(R.id.textView19);
        TextView messageText = (TextView) findViewById(R.id.textView20);
        TextView skipText = (TextView) findViewById(R.id.textView21);
        ((TextView) findViewById(R.id.textView18)).setText("Correct: " + MainActivity.rightCount);
        wrongText.setText("Wrong: " + MainActivity.wrongCount);
        skipText.setText("Skipped: " + MainActivity.skipCount);
        if (MainActivity.wrongCount.intValue() + MainActivity.skipCount.intValue() < 3) {
            messageText.setText("Amazing Job!");
        } else if (MainActivity.wrongCount.intValue() + MainActivity.skipCount.intValue() < 5) {
            messageText.setText("Great Job!");
        } else if (MainActivity.wrongCount.intValue() + MainActivity.skipCount.intValue() < 8) {
            messageText.setText("Good Job!");
        } else {
            messageText.setText("You can do better!");
        }
    }

    public void quit() {
        final Context context = this;
        ((Button) findViewById(R.id.button21)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Results.this.startActivity(new Intent(context, MainActivity.class));
            }
        });
    }
}
