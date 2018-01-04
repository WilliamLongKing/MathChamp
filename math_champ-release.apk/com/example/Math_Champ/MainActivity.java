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

public class MainActivity extends AppCompatActivity {
    public static String activityMode;
    public static String gradeLevel;
    public static Integer questionCounter = Integer.valueOf(0);
    public static Integer rightCount = Integer.valueOf(0);
    public static Integer skipCount = Integer.valueOf(0);
    public static Integer time;
    public static Integer wrongCount = Integer.valueOf(0);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView2 = (TextView) findViewById(R.id.button);
        ((TextView) findViewById(R.id.textView2)).setTypeface(myTypeface);
        myTextView2.setTypeface(myTypeface);
        activitySelection();
    }

    public void activitySelection() {
        final Context context = this;
        ((Button) findViewById(R.id.button)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(context, ActivitySelection.class));
            }
        });
    }
}
