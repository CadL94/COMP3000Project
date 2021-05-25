package com.example.projectapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class QuizInfo extends AppCompatActivity {

    TextView textViewQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_info);

        textViewQuiz = (TextView) findViewById(R.id.textViewQuiz);

        String para = "This page will contain information that will help you answer questions on the multiple choice quiz" +
                "\n------------------------------------------------------------------\n Passwords\n • You should never share your password as this compromises the security of your accounts as you do not know what the person will do with your account." +
                " Being the only one with knowledge of the password you can assure you are the only one with access to the accounts.\n \n • A strong password will contain at least 12 characters and will use uppercase and lowercase characters, numbers and special symbols. " +
                "Having a password that does not contain memorable dates or personal information will also make the password more secure.\n"
                 + "\n • It is never a good choice to reuse your password for other website because if your password has been compromised for one website/account the rest of the websites and accounts are at risk also due to having the same password.\n"
                + "\n• Bad password practice would be writing it down or saving the password into a text file, these methods could result in your password being easily discovered and your accounts being compromised. Good password practice would be using password manager software to store your password in securely.\n " +
                "------------------------------------------------------------------\n" +
                "Phishing\n• Phishing is a type of attack used by cybercriminals. It involves targeting individuals with the aim of getting them to click on a link to try and get them to hand over sensitive information or installing malware." +
                "The link can appear to be legitimate and appear to be from widely used websites such as amazon ,paypal, banking services and it will prompt the target to log in with their personal details for the attacker to then steal. Common features of phishing emails and texts are, too good to be true offers that catch the targets attention, sense of urgency, hyperlinks, attachments, unusual sender. " +
                "Being cautious about the communications you receive and not clicking any direct links in messages sent by someone unfamiliar are good practices to have in defence of phishing but manually navigating to your familiar website(amazon, PayPal, banking services) to log in yourself through the address bar is the best.  \n" + "------------------------------------------------------------------\n"
                + "Ransomware" + "\n• Ransomware is a type of malware and is used to encrypt a victim’s files or computer. The attacker can then make payment demands from the victim to decrypt the victim’s files, usually asking for it to be paid in bitcoin." +
                " Ransomware is commonly delivered via emails via spam phishing emails or malicious websites tricking users into downloading a file.  \n" + "------------------------------------------------------------------\n" + "Malware\n" +
                "• Malware which is shorthand for malicious software contains malicious code that is usually developed by cybercriminals. Malware is typically used by cybercriminals to cause damage to computer systems or steal sensitive data for financial gain. " +
                "Backing up your data and making sure all your devices and software are updated regularly will decrease the likelihood of being a victim of malware attacks.\n \n• Running a full virus scan at least once a week will help towards keeping your device healthy and malware free \n"
                + "------------------------------------------------------------------\n" + "• When finding a USB stick at work the best solution is to hand it into the IT team to deal with as they will know the correct way to deal with it. " +
                "It is not safe to plug an unknown USB stick into a computer system as it could contain malicious software added by cybercriminals with the intention of causing harm to the system\n \n• A padlock in the website address bar represents the webpage has secure socket layer(SSL) installed this will usually indicate the website is secure. " +
                "Looking for a green padlock that displays SSL information is just one of the many checks you should do as it is not a complete confirmation of security as some cybercriminals can use security certificates on their fraudulent unsecure websites because hosting providers do not have resources to check every new site.\n " +
                "\n• It is not just cyber-security professional’s responsibility for upholding good cyber security practices, everyone in the organisation has a part to play. This gives the best chance for strong security and less chance of cyber security incidents to occur if everyone is following good cyber security practices.\n " +
                "\n• If your email has been hacked or you have a suspicion there are steps that should be taken to ensure you have full control back over your account. These steps are reset your password, change security question and monitor for fraudulent activity\n " +
                "\n• Individuals sharing their personal information online could result in them becoming a target of identity theft. Identity theft is where the attacker could use the personal information to impersonate the target individual and use their information to commit crimes. Not sharing any personal/sensitive information online is the best action to prevent this and maintain online digital privacy. \n " +
                "\n• Pop up messages saying you have won a prize are a scam that try to get the user to click them. Closing down the internet browser or tab completely is good solution to dealing the situation. \n " +
                "\n• Hacking is a popular method of attack for cyber criminals and the attacker could steal information or money and cause damage to a business or person. Although hacking is usually spoken about for malicious purposes, it could also be used to improve the security of computer systems and networks where ethical hackers who are computer experts find the vulnerabilities and" +
                "fix them therefore preventing possible future hacks from happening.\n \n• There are a lot of sensitive and personal data stored on mobile phones. Most smartphone have the option of remotely disabling or wiping you phone which would be the best course of action to stop your information being compromised.\n " +
                "\n• 2FA adds an extra layer of security to your account by providing an additional login credential. This will make your account more secure as you will need more then just the typical user name and password to log in as it will prompt you to provide another piece of information before you can gain access. " ;

        textViewQuiz.setText(para);
        textViewQuiz.setMovementMethod(new ScrollingMovementMethod());
    }
}