package com.example.Math_Champ;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.example.testapp.R;
import java.util.Random;

public class Questions extends AppCompatActivity {
    public String answer = "";
    public String questionText;
    public Integer solution;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        questionActivity();
        buttonPresses();
        MainActivity.questionCounter = Integer.valueOf(0);
        MainActivity.wrongCount = Integer.valueOf(0);
        MainActivity.rightCount = Integer.valueOf(0);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Always Together.otf");
        TextView myTextView11 = (TextView) findViewById(R.id.button7);
        TextView myTextView12 = (TextView) findViewById(R.id.button8);
        TextView myTextView13 = (TextView) findViewById(R.id.button9);
        TextView myTextView14 = (TextView) findViewById(R.id.button10);
        TextView myTextView15 = (TextView) findViewById(R.id.button11);
        TextView myTextView16 = (TextView) findViewById(R.id.button12);
        TextView myTextView17 = (TextView) findViewById(R.id.button13);
        TextView myTextView18 = (TextView) findViewById(R.id.button14);
        TextView myTextView19 = (TextView) findViewById(R.id.button15);
        TextView myTextView20 = (TextView) findViewById(R.id.button16);
        TextView myTextView21 = (TextView) findViewById(R.id.button17);
        TextView myTextView22 = (TextView) findViewById(R.id.textView6);
        TextView myTextView23 = (TextView) findViewById(R.id.textView7);
        TextView myTextView24 = (TextView) findViewById(R.id.textView8);
        TextView myTextView25 = (TextView) findViewById(R.id.textView9);
        TextView clearButton = (TextView) findViewById(R.id.button18);
        TextView enterButton = (TextView) findViewById(R.id.button19);
        TextView correctText = (TextView) findViewById(R.id.textView10);
        TextView incorrectText = (TextView) findViewById(R.id.textView15);
        ((TextView) findViewById(R.id.button6)).setTypeface(myTypeface);
        myTextView11.setTypeface(myTypeface);
        myTextView12.setTypeface(myTypeface);
        myTextView13.setTypeface(myTypeface);
        myTextView14.setTypeface(myTypeface);
        myTextView15.setTypeface(myTypeface);
        myTextView16.setTypeface(myTypeface);
        myTextView17.setTypeface(myTypeface);
        myTextView18.setTypeface(myTypeface);
        myTextView19.setTypeface(myTypeface);
        myTextView20.setTypeface(myTypeface);
        myTextView21.setTypeface(myTypeface);
        myTextView22.setTypeface(myTypeface);
        myTextView23.setTypeface(myTypeface);
        myTextView24.setTypeface(myTypeface);
        myTextView25.setTypeface(myTypeface);
        clearButton.setTypeface(myTypeface);
        enterButton.setTypeface(myTypeface);
        correctText.setTypeface(myTypeface);
        incorrectText.setTypeface(myTypeface);
    }

    public void questionActivity() {
        if (MainActivity.activityMode != "Activity: Arithmetic") {
            return;
        }
        if (MainActivity.questionCounter.intValue() < 25) {
            arithmeticQuestions();
        } else {
            startActivity(new Intent(this, Results.class));
        }
    }

    public void buttonPresses() {
        Button buttonTwo = (Button) findViewById(R.id.button7);
        Button buttonThree = (Button) findViewById(R.id.button8);
        Button buttonFour = (Button) findViewById(R.id.button9);
        Button buttonFive = (Button) findViewById(R.id.button10);
        Button buttonSix = (Button) findViewById(R.id.button11);
        Button buttonSeven = (Button) findViewById(R.id.button12);
        Button buttonEight = (Button) findViewById(R.id.button13);
        Button buttonNine = (Button) findViewById(R.id.button14);
        Button buttonZero = (Button) findViewById(R.id.button15);
        final Button buttonMinus = (Button) findViewById(R.id.button16);
        Button decimalButton = (Button) findViewById(R.id.button17);
        Button clearButton = (Button) findViewById(R.id.button18);
        Button enterButton = (Button) findViewById(R.id.button19);
        final TextView answerText = (TextView) findViewById(R.id.textView6);
        final Button button = enterButton;
        ((Button) findViewById(R.id.button6)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("1").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonTwo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("2").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonThree.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("3").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonFour.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("4").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonFive.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("5").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonSix.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("6").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonSeven.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("7").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonEight.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("8").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonNine.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("9").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonZero.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                Questions questions = Questions.this;
                questions.answer = stringBuilder.append(questions.answer).append("0").toString();
                answerText.setText(Questions.this.answer);
                button.setText("Enter");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        buttonMinus.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Questions.this.answer = "-" + Questions.this.answer;
                answerText.setText(Questions.this.answer);
                buttonMinus.setEnabled(false);
                button.setText("Enter");
                button.setEnabled(false);
            }
        });
        button = enterButton;
        clearButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                answerText.setText("");
                Questions.this.answer = "";
                buttonMinus.setEnabled(true);
                button.setText("Skip");
                button.setEnabled(true);
            }
        });
        button = enterButton;
        enterButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (answerText.length() > 0) {
                    Questions.this.correctAnswer();
                } else {
                    MainActivity.skipCount = Integer.valueOf(MainActivity.skipCount.intValue() + 1);
                }
                buttonMinus.setEnabled(true);
                MainActivity.questionCounter = Integer.valueOf(MainActivity.questionCounter.intValue() + 1);
                answerText.setText("");
                Questions.this.answer = "";
                button.setText("Skip");
                Questions.this.arithmeticQuestions();
                Questions.this.questionActivity();
            }
        });
    }

    public void arithmeticQuestions() {
        TextView firstNumber = (TextView) findViewById(R.id.textView7);
        TextView operator = (TextView) findViewById(R.id.textView8);
        TextView secondNumber = (TextView) findViewById(R.id.textView9);
        TextView cheatView = (TextView) findViewById(R.id.textView14);
        Integer number1 = Integer.valueOf(Integer.parseInt(firstNumber.getText().toString()));
        Integer number2 = Integer.valueOf(Integer.parseInt(secondNumber.getText().toString()));
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random randOperator = new Random();
        int value1;
        int value2;
        String string1;
        String string2;
        int operatorType;
        if (MainActivity.gradeLevel == "Level: 1") {
            value1 = rand1.nextInt(10);
            value2 = rand2.nextInt(10);
            string1 = Integer.toString(value1);
            string2 = Integer.toString(value2);
            firstNumber.setText(string1);
            secondNumber.setText(string2);
            operatorType = randOperator.nextInt(3);
            if (operatorType == 1) {
                operator.setText("+");
            } else if (operatorType == 2) {
                operator.setText("-");
            }
            if (operator.getText().toString().contains("+")) {
                this.solution = Integer.valueOf(value1 + value2);
            } else if (operator.getText().toString().contains("-")) {
                this.solution = Integer.valueOf(value1 - value2);
            } else if (operator.getText().toString().contains("×")) {
                this.solution = Integer.valueOf(value1 * value2);
            }
        } else if (MainActivity.gradeLevel == "Level: 2") {
            operatorType = randOperator.nextInt(4);
            if (operatorType == 1) {
                operator.setText("+");
            } else if (operatorType == 2) {
                operator.setText("-");
            } else if (operatorType == 3) {
                operator.setText("×");
            }
            value1 = rand1.nextInt(100);
            value2 = rand2.nextInt(100);
            if (operatorType != 3) {
                string1 = Integer.toString(value1);
                string2 = Integer.toString(value2);
                firstNumber.setText(string1);
                secondNumber.setText(string2);
            } else {
                value3 = rand3.nextInt(10);
                string1 = Integer.toString(value1);
                string3 = Integer.toString(value3);
                firstNumber.setText(string1);
                secondNumber.setText(string3);
            }
            if (operator.getText().toString().contains("+")) {
                this.solution = Integer.valueOf(value1 + value2);
            } else if (operator.getText().toString().contains("-")) {
                this.solution = Integer.valueOf(value1 - value2);
            } else if (operator.getText().toString().contains("×")) {
                this.solution = Integer.valueOf(value1 * value2);
            }
        } else if (MainActivity.gradeLevel == "Level: 3") {
            operatorType = randOperator.nextInt(4);
            if (operatorType == 1) {
                operator.setText("+");
            } else if (operatorType == 2) {
                operator.setText("-");
            } else if (operatorType == 3) {
                operator.setText("×");
            }
            value1 = rand1.nextInt(1000);
            value2 = rand2.nextInt(1000);
            if (operatorType != 3) {
                string1 = Integer.toString(value1);
                string2 = Integer.toString(value2);
                firstNumber.setText(string1);
                secondNumber.setText(string2);
            } else {
                value3 = rand3.nextInt(50);
                string1 = Integer.toString(value1);
                string3 = Integer.toString(value3);
                firstNumber.setText(string1);
                secondNumber.setText(string3);
            }
            if (operator.getText().toString().contains("+")) {
                this.solution = Integer.valueOf(value1 + value2);
            } else if (operator.getText().toString().contains("-")) {
                this.solution = Integer.valueOf(value1 - value2);
            } else if (operator.getText().toString().contains("×")) {
                this.solution = Integer.valueOf(value1 * value2);
            }
        }
    }

    public void correctAnswer() {
        TextView input = (TextView) findViewById(R.id.textView6);
        TextView correctView = (TextView) findViewById(R.id.textView10);
        TextView incorrectView = (TextView) findViewById(R.id.textView15);
        Integer inputAnswer = Integer.valueOf(Integer.parseInt(input.getText().toString()));
        String userInput = input.toString();
        if (inputAnswer.equals(this.solution)) {
            MainActivity.rightCount = Integer.valueOf(MainActivity.rightCount.intValue() + 1);
            correctView.setText("Correct: " + MainActivity.rightCount);
            return;
        }
        MainActivity.wrongCount = Integer.valueOf(MainActivity.wrongCount.intValue() + 1);
        incorrectView.setText("Incorrect: " + MainActivity.wrongCount);
    }
}
