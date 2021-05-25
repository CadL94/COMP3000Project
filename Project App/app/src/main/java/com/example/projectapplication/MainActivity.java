package com.example.projectapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonGen,buttonStrength,buttonQuiz,buttonHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button that opens password generator once pressed.
        buttonGen = (Button) findViewById(R.id.buttonGen);
        buttonGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });

        //Button that opens password strength checker once pressed.
        buttonStrength = (Button) findViewById(R.id.buttonStrength);
        buttonStrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });

        //Button that opens up the quiz once pressed.
        buttonQuiz = (Button) findViewById(R.id.buttonQuiz);
        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }
        });

        //Button that opens up the quiz help once pressed.
        buttonHelp = (Button) findViewById(R.id.buttonHelp);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();

            }
        });

    }
    //Opens Password Generator
    private void openActivity2() {
        Intent intent = new Intent(this, PasswordGenerator.class);
        startActivity(intent);
    }
    //Opens Password strength checker
    private void openActivity3() {
        Intent intent = new Intent(this, PasswordStrength.class);
        startActivity(intent);
    }
    //Opens quiz
    private void openActivity4() {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    //opens quiz info
    private void openActivity5() {
        Intent intent = new Intent(this, QuizInfo.class);
        startActivity(intent);
    }
}