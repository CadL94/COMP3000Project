package com.example.projectapplication;

import android.os.Bundle;
import android.widget.TextView;

public class PasswordStrengthhelp extends PasswordStrength {
    TextView textViewStrength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_strengthhelp);

        textViewStrength = (TextView) findViewById(R.id.textViewStrength);
        String strengthHelp = "A strong to very strong password will contain at least 12 to 16 characters and will use a mixture of uppercase (A B C) and lowercase characters (a b c), numbers (321) and special symbols (@$%!).\n " +
                "\nHaving a password that does not contain memorable dates or personal information will also make the password more secure.\n" +
                "\nAvoid using the same password on multiple websites/accounts as this puts your other accounts/websites at risk if your password gets compromised.";

        textViewStrength.setText(strengthHelp);
    }

}