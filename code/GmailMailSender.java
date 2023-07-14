

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class GmailMailSender{
    static boolean sendEmail(String to , int code) {
        Settings set = new Settings();
        String From = set.getFrom();
        String Subject = set.getSubject();
        String text = set.getText().concat(String.valueOf(code));
        String user = set.getUser();
        String password = set.getPassword();

        Properties pr = new Properties();
        pr.put("mail.smtp.host", "smtp.gmail.com");
        pr.put("mail.smtp.port", "465");
        pr.put("mail.smtp.ssl.enable", "true");
        pr.put("mail.smtp.auth", "true");


        Session se = Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        try {
            Message mes =  new MimeMessage(se);
            mes.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mes.setFrom(new InternetAddress(From));
            mes.setSubject(Subject);
            mes.setText(text);
            Transport.send(mes);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
