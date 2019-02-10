package com.example.logica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText answerOne;
    private EditText answerTwo;
    private EditText answerThree;
    private EditText answerFour;
    private Button submitButton;

    String inputAnswerOne;
    String inputAnswerTwo;
    String inputAnswerThree;
    String inputAnswerFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOne = (EditText) findViewById(R.id.inputOne);
        answerTwo = (EditText) findViewById(R.id.inputTwo);
        answerThree = (EditText) findViewById(R.id.inputThree);
        answerFour = (EditText) findViewById(R.id.inputFour);
        submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInput();
            }
        });


    }

    //Checks the input
    private void checkInput() {

        inputAnswerOne = answerOne.getText().toString();
        inputAnswerTwo = answerTwo.getText().toString();
        inputAnswerThree = answerThree.getText().toString();
        inputAnswerFour = answerFour.getText().toString();

        if (inputAnswerOne.equals("t") && inputAnswerTwo.equals("f") &&
                inputAnswerThree.equals("f") && inputAnswerFour.equals("f") ||
                inputAnswerOne.equals("T") && inputAnswerTwo.equals("F") &&
                        inputAnswerThree.equals("F") && inputAnswerFour.equals("F")){
            answerCorrect();
        } else if (inputAnswerOne.equals("") || inputAnswerTwo.equals("") ||
                inputAnswerThree.equals("") || inputAnswerFour.equals("")){
            answersEmpty();
        } else {
            answerIncorrect();
        }
    }

    //Gives toastmessage when the answers are correct
    private void answerCorrect() {
        Toast.makeText(this, "The answers are correct!", Toast.LENGTH_SHORT).show();
    }

    //Gives toastmessage when the answers are incorrect
    private void answerIncorrect() {
        Toast.makeText(this, "The answers are incorrect..", Toast.LENGTH_SHORT).show();
    }

    //Gives toastmessage when the answers are empty
    private void answersEmpty() {
        Toast.makeText(this, "You need to fill in the answers",
                Toast.LENGTH_SHORT).show();
    }
}
