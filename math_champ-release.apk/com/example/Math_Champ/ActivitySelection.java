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

public class ActivitySelection extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_activity_selection);
        gradeSelection();
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView4 = (TextView) findViewById(R.id.textView4);
        TextView myTextView5 = (TextView) findViewById(R.id.button2);
        ((TextView) findViewById(R.id.textView3)).setTypeface(myTypeface);
        myTextView4.setTypeface(myTypeface);
        myTextView5.setTypeface(myTypeface);
    }

    public void gradeSelection() {
        final Context context2 = this;
        ((Button) findViewById(R.id.button2)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ActivitySelection.this.startActivity(new Intent(context2, GradeSelection.class));
                MainActivity.activityMode = "Activity: Arithmetic";
            }
        });
    }
}
