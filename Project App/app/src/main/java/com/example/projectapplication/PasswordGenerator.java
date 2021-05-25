package com.example.projectapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Random;

public class PasswordGenerator extends AppCompatActivity {
    private Button passgenButton,copyclipButton;
    private TextView passviewText,passgenText;
    private CheckBox hideBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_generator);

        //Displayed text on screen
        passgenText = (TextView)findViewById(R.id.passgenText);
        passgenText.setText(new StringBuilder().append("Having a weak password could leave you vulnerable to various password attacks which can lead to your password being known by other unauthorized individuals. ")
                .append("Having a strong password will make you less vulnerable to these attacks and make you more protected and secure. ")
                .append("\n\nThis strong password generator will generate a strong password for you at the press of the button. It will provide you with a random combination of 16 characters that include symbols, numbers, upper case and lowercase letters.")
                .append("\n\nFor added security please clear your android clipboard once the password has been stored safely or remembered.").toString());
        passgenText.getText().toString();



        //Button that generates the strong password with a length of 16 once pressed. Password text will display on the screen.
        passviewText = (TextView)findViewById(R.id.passviewText);
        passgenButton = (Button)findViewById(R.id.passgenButton);
        passgenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passviewText.setText(generateString(16));

            }
        });

        //Button that when pressed copies the password text to android clipboard.
        copyclipButton = (Button)findViewById(R.id.copyclipButton);
        copyclipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("EditText", passviewText.getText().toString());
                clipboard.setPrimaryClip(clip);

            }
        });

        //Check box that gives the user the choice to hide or display the password text.
        hideBox = findViewById(R.id.hideBox);
        hideBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    passviewText.setTransformationMethod(PasswordTransformationMethod.getInstance());

                } else {
                    passviewText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                }
            }
        });



    }

    //Generates a random strong password
    private String generateString(int passLength) {
        char[] chars ="@#*!$%.{=MNBVCXZLKJHGFDSAPOIUYTREWQ?}~:|;()'/^&+0987654321qwertyuiopzxcvbnmasdfghjkl".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random passRandom = new Random();
        for ( int i=0; i<passLength;i++)
        {
            char c = chars[passRandom.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();

    }


}