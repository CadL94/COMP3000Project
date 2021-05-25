package com.example.projectapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.regex.Pattern;

public class PasswordStrength extends AppCompatActivity {

    EditText strengthPassword;
    TextView azView,azcapView,numberView,charView,passlengthView,passlengthView2;
    ImageView padLock,padLock11,padLock2,padLock22,padLock3,padLock33,padLock4, greenTick0,greenTick1,greenTick2,greenTick3,greenTick4,greenTick5;
    Button strengthHelp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_strength);


        strengthPassword = findViewById(R.id.passworldVal);
        azView = findViewById(R.id.azView);
        azcapView = findViewById(R.id.azcapView);
        numberView = findViewById(R.id.numberView);
        charView = findViewById(R.id.charView);
        passlengthView = findViewById(R.id.passlengthView);
        passlengthView2 = findViewById(R.id.passlengthView2);
        padLock = findViewById(R.id.padLock);
        padLock11 = findViewById(R.id.padLock11);
        padLock2 = findViewById(R.id.padLock2);
        padLock22 = findViewById(R.id.padLock22);
        padLock3 = findViewById(R.id.padLock3);
        padLock33 = findViewById(R.id.padLock33);
        padLock4 = findViewById(R.id.padLock4);
        greenTick0 = findViewById(R.id.greenTick0);
        greenTick1 = findViewById(R.id.greenTick1);
        greenTick2 = findViewById(R.id.greenTick2);
        greenTick3 = findViewById(R.id.greenTick3);
        greenTick4 = findViewById(R.id.greenTick4);
        greenTick5 = findViewById(R.id.greenTick5);

        //Button that opens up the password strength help section once pressed.
        strengthHelp = (Button) findViewById(R.id.strengthHelp);
        strengthHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityhelp();

            }
        });

        strengthPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String pass = strengthPassword.getText().toString();
                passwordValidator(pass);
                padlock(pass);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void passwordValidator(String password){
        //Uppercase characters A-Z.
        Pattern upperCase = Pattern.compile("[A-Z]");
        //Text will change to green once user enters an uppercase character.
        if (!upperCase.matcher(password).find()) {
            azcapView.setTextColor(Color.RED);
            greenTick1.setVisibility(View.INVISIBLE);

        }  else {
            azcapView.setTextColor(Color.GREEN);
            greenTick1.setVisibility(View.VISIBLE);

        }

        //Lower case characters a-z.
        Pattern lowerCase = Pattern.compile("[a-z]");
        //Text will change to green once user enters an lowercase character.
        if (!lowerCase.matcher(password).find()) {
            azView.setTextColor(Color.RED);
            greenTick0.setVisibility(View.INVISIBLE);
        }  else {
            azView.setTextColor(Color.GREEN);
            greenTick0.setVisibility(View.VISIBLE);

        }

        //Numbers 0-9
        Pattern numberCase = Pattern.compile("[0-9]");
        //Text will change to green once user enters an number.
        if (!numberCase.matcher(password).find()) {
            numberView.setTextColor(Color.RED);
            greenTick2.setVisibility(View.INVISIBLE);
        }  else {
            numberView.setTextColor(Color.GREEN);
            greenTick2.setVisibility(View.VISIBLE);


        }
        //Selection of special case characters ([@#*!$%.{}~:|;()'/^&+=])
        Pattern specialCase = Pattern.compile("[@#*!$%.{}~:|;()'/^&+=]");
        //Text will change to green once user enters an special case character([@#*!$%.{}~:|;()'/^&+=])
        if (!specialCase.matcher(password).find()) {
            charView.setTextColor(Color.RED);
            greenTick3.setVisibility(View.INVISIBLE);
        }  else {
            charView.setTextColor(Color.GREEN);
            greenTick3.setVisibility(View.VISIBLE);


        }
        //if the character length is equal to 12 or above the text will turn green and a green tick will appear
        if (password.length() < 12 ) {
            passlengthView.setTextColor(Color.RED);
            greenTick4.setVisibility(View.INVISIBLE);
        } else {
            passlengthView.setTextColor(Color.GREEN);
            greenTick4.setVisibility(View.VISIBLE);
        }
        //if the character length is equal to 16 or above the text will turn green and a green tick will appear
        if (password.length() < 16 ) {
            passlengthView2.setTextColor(Color.RED);
            greenTick5.setVisibility(View.INVISIBLE);
        } else {
            passlengthView2.setTextColor(Color.GREEN);
            greenTick5.setVisibility(View.VISIBLE);
        }


    }

    //Logical statements that if met a padlock will appear/disappear.
    public void padlock(String padlock){


        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");


        if (!lowerCase.matcher(padlock).find() && !upperCase.matcher(padlock).find()) {
            padLock.setVisibility(View.INVISIBLE);
        }  else  {
            padLock.setVisibility(View.VISIBLE);

        }


        Pattern numberCase = Pattern.compile("[0-9]");
        Pattern specialCase = Pattern.compile("[@#*!$%.{}~:|;()'/^&+=]");

        if (!numberCase.matcher(padlock).find() && !specialCase.matcher(padlock).find()) {
            padLock11.setVisibility(View.INVISIBLE);
        } else {
            padLock11.setVisibility(View.VISIBLE);

        }

        if (!lowerCase.matcher(padlock).find() || !upperCase.matcher(padlock).find() || !numberCase.matcher(padlock).find() && !specialCase.matcher(padlock).find() || padlock.length() < 8 && padlock.length() < 11) {
            padLock2.setVisibility(View.INVISIBLE);
        }  else {
            padLock2.setVisibility(View.VISIBLE);

        }


        if (!lowerCase.matcher(padlock).find() && !upperCase.matcher(padlock).find() || !specialCase.matcher(padlock).find() || !numberCase.matcher(padlock).find() || padlock.length() < 8 && padlock.length() < 11) {
            padLock22.setVisibility(View.INVISIBLE);
        }  else {
            padLock22.setVisibility(View.VISIBLE);
        }



        if (!lowerCase.matcher(padlock).find() || !upperCase.matcher(padlock).find() || !numberCase.matcher(padlock).find() && !specialCase.matcher(padlock).find() || padlock.length() < 12 && padlock.length() < 15) {
            padLock3.setVisibility(View.INVISIBLE);
        }  else {
            padLock3.setVisibility(View.VISIBLE);

        }

        if (!lowerCase.matcher(padlock).find() && !upperCase.matcher(padlock).find() || !specialCase.matcher(padlock).find() || !numberCase.matcher(padlock).find() || padlock.length() < 12 && padlock.length() < 15) {
            padLock33.setVisibility(View.INVISIBLE);
        }  else {
            padLock33.setVisibility(View.VISIBLE);
        }



        if (!lowerCase.matcher(padlock).find() || !upperCase.matcher(padlock).find() || !numberCase.matcher(padlock).find() || !specialCase.matcher(padlock).find() || padlock.length() < 16 ) {
            padLock4.setVisibility(View.INVISIBLE);
        }  else {
            padLock4.setVisibility(View.VISIBLE);

        }



    }

    //Opens password strength help page
    private void openActivityhelp() {
        Intent intent = new Intent(this, PasswordStrengthhelp.class);
        startActivity(intent);


    }
}