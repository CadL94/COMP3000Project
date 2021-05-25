package com.example.projectapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    TextView scoreView, question;
    Button choice1, choice2, choice3;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int myScore = 0;
    private int mQuestionsLength = mQuestions.questionsList.length;

    Random r;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);


        question = (TextView) findViewById(R.id.question);
        scoreView = (TextView) findViewById(R.id.scoreView);
        scoreView.setText("Score: " + myScore);
        updateQuestion(r.nextInt(mQuestionsLength));

        //If the choice selected is the correct answer a message will display saying "correct" and it will continue to the next question and the score will update.
        // If the question is incorrect a message will display saying "incorrect" and the game over pop up will occur.
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice1.getText() == mAnswer){
                    myScore++;
                    updateScore(myScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    gameOver();
                }

            }
        });

        //If the choice selected is the correct answer a message will display saying "correct" and it will continue to the next question and the score will update.
        // If the question is incorrect a message will display saying "incorrect" and the game over pop up will occur.
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice2.getText() == mAnswer){
                    myScore++;
                    updateScore(myScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    gameOver();
                }

            }
        });

        //If the choice selected is the correct answer a message will display saying "correct" and it will continue to the next question and the score will update.
        // If the question is incorrect a message will display saying "incorrect" and the game over pop up will occur.
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice3.getText() == mAnswer){
                    myScore++;
                    updateScore(myScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    gameOver();
                }

            }
        });



    }
    //Updates questions, choices
    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        choice1.setText(mQuestions.getChoice1(num));
        choice2.setText(mQuestions.getChoice2(num));
        choice3.setText(mQuestions.getChoice3(num));
        mAnswer = mQuestions.getCorrectAnswer(num);


    }
    //Pop up box saying game over and will display 2 options to the user "Main menu" and "New Game"
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz.this);
        alertDialogBuilder
                .setMessage("Game Over, that answer was incorrect! Well done your score is " + myScore + " points.")
                .setCancelable(false)
                .setPositiveButton("New game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), Quiz.class));
                                finish();

                            }
                        })
                .setNegativeButton("Main Menu",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();  //change to main menu on project

                            }
                        });
        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
    //Updates score total
    private void updateScore(int score) {
        scoreView.setText("Score: " + myScore);
    }

}