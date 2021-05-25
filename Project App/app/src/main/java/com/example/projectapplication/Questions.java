package com.example.projectapplication;

public class Questions {
    //List of quiz questions
    public String questionsList[] = {
            "When is it okay to reuse a password?",
            "Who is responsible for upholding good cyber security practices?",
            "What is the best way to improve a weak password such as Elephant321",
            "You have a suspicion that your personal email account has been compromised, what should you do?",
            "The best defence against malware is?",
            "Best method of storing a password is?",
            "Which of these below is the best for maintaining your online digital privacy?",
            "Having a strong password will increase your security. Which password is the strongest?",
            "Which of these scenarios is a common example of a 'phishing' attack?",
            "Which type of cyber-attack is usually performed through text/social media messages and emails?",
            "For a more secure password, what should you make sure your password contains?",
            "When visiting a website, in the address bar which icon can be seen to show that the website could be secure?",
            "Sharing your personal/sensitive information online could make you at risk of?",
            "You are on your lunch break at work and you notice a work USB stick on the floor outside, what should you do?",
            "You discover your computer you have been working on from home has been infected with ransomware and you cannot access your files and the hacker is demanding you to send 0.2BTC to remove it. What should you do?",
            "You have just got home and realised you have left your phone on the bus, what should you do?",
            "A message has popped up while you are browsing the internet and it says you are a lucky winner and need to click to claim your prize, what should you do?",
            "How often should you run a full virus scan?",
            "Who are hackers?",
            "You receive an email from an unrecognisable address and it says you are entitled to claim a rather large amount of money, please click the link to claim. What should you do?",
            "Who should you share your password with?",
            "How do cyber criminals usually trick others into infecting their own computer with ransomware?",
            "You receive an email that looks like its from amazon and says you have been sent an £50 amazon giftcard and it has been added to your account, click the link to spend it. What should you do?",
            "You receive a text saying your paypal account has remaining debts to pay off please click this link to log in, what should you do?",
            "You have just got a warning email from your bank that suspicious activity has been detected and you need to log in immediately using the URL link provided. Whats the best action to take?",
            "What is malware?",
            "What is Two-Factor Authentication (2FA)?"







    };
    //Selection of choices for each question.
    private String questionChoices[][] = {
            {"When you are using social media websites", "Never", "When it is too hard to remember a long password"},
            {"Everyone", "Cyber-security professionals", "No one"},
            {"Add an extra number", "Add an extra character + Number", "Add multiple characters + symbols + numbers"},
            {"Immediately reset your password, change security question and monitor for fraudulent activity", "Respond to the suspicious email you have received", "Delete the email and hope nothing comes from it"},
            {"Regularly update all devices, software and back up data", "Buy cyber-security insurance", "Run a virus scan once a month"},
            {"Write it down", "Using password manager software", "Save in a text file"},
            {"Not sharing personal information on social media", "Unsubscribing from spam emails", "Only sharing personal information with those who ask through private messages on social media"},
            {"Password123", "Pets name", "!JO6O6p55@yq"},
            {"Both scenarios are common examples of phishing attacks", "You receive an email claiming to be from your bank asking you to enter your bank account details to receive unclaimed money", "You receive a text message asking you to click a link to pay for your postal delivery"},
            {"Worms", "Ransomware", "Phishing"},
            {"Memorable dates and names", "Capital letters only", "A mixture of upper and lower case letters, symbols and numbers"},
            {"A Padlock", "A Door", "A Shield"},
            {"Worms", "Malware", "Identity theft"},
            {"Leave it where it is", "Hand it in to your works IT team for them to deal with", "Take it home and plug it in to try and find who it belongs to"},
            {"Pay the ransom to get your files back", "Disconnect your computer from the network and contact the work IT department", "Turn the computer off and hope it has gone the next day"},
            {"Leave a voicemail with your personal details", "Call the phones network to let them know", "Remotely disable/wipe your phone"},
            {"Celebrate winning a prize", "Click the link to claim the prize", "Close down your internet browser/tab"},
            {"At least once a week", "Once a month", "Once a year"},
            {"Hackers are malicious computer criminals", "Computer Experts", "Hackers could be either ethical computer experts or malicious computer criminals"},
            {"Report and block the email", "Click to claim your money", "Forward the email to friends and family"},
            {"Close friends", "Work colleagues", "No one"},
            {"Clicking links in spam emails", "Visiting malicious websites", "Cyber criminals use both these methods"},
            {"Manually go to the official amazon website on another tab to check", "Click the link displayed in the email to spend your gift card", "Forward the email to friends to show them"},
            {"Open up an internet browser and manually go to the paypal website to check", "Click the link displayed in the text to log in", "Reply to the text message"},
            {"Contact your bank using the contact number on the back of your debit/credit card", "Click the link to log in and find out whats going on", "Reply to the email"},
            {"Malicious software typically used by cybercriminals to cause damage to computer systems or steal data for financial gain", "Anti-virus software", "A piece of hardware inside a computer"},
            {"When enabled 2FA adds an extra layer of security to your account by providing an additional login credential", "A waste of time, I want to log in fast", "Virus scanning software"}





    };
    //Correct answers for each question
    private String correctAnswers[] = {"Never", "Everyone", "Add multiple characters + symbols + numbers",
            "Immediately reset your password, change security question and monitor for fraudulent activity",
            "Regularly update all devices, software and back up data", "Using password manager software",
            "Not sharing personal information on social media", "!JO6O6p55@yq",
            "Both scenarios are common examples of phishing attacks", "Phishing",
            "A mixture of upper and lower case letters, symbols and numbers",
            "A Padlock","Identity theft",
            "Hand it in to your works IT team for them to deal with","Disconnect your computer from the network and contact the work IT department",
            "Remotely disable/wipe your phone","Close down your internet browser/tab",
            "At least once a week","Hackers could be either ethical computer experts or malicious computer criminals",
            "Report and block the email","No one","Cyber criminals use both these methods",
            "Manually go to the official amazon website on another tab to check","Open up an internet browser and manually go to the paypal website to check",
            "Contact your bank using the contact number on the back of your debit/credit card",
            "Malicious software typically used by cybercriminals to cause damage to computer systems or steal data for financial gain",
            "When enabled 2FA adds an extra layer of security to your account by providing an additional login credential"
    };


    public String getQuestion(int a){
        String question = questionsList[a];
        return question;

    }

    public String getChoice1(int a){
        String choice = questionChoices[a] [0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = questionChoices[a] [1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = questionChoices[a] [2];
        return choice;
    }


    public String getCorrectAnswer(int a){
        String answer = correctAnswers[a];
        return answer;
    }


}

