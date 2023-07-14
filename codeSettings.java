package org.example;

public class Settings {
    private String From = "xyz@gmail.com";   //whole gmail
    private String Subject = "Verification ";
    private String text = "Your Verification Code is ";
    private String user = "xyz";        // gmail username
    private  String password = ""; //Generate from https://myaccount.google.com/apppasswords

    public String getFrom() {
        return From;
    }

    public String getSubject() {
        return Subject;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
