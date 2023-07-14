

import java.util.Scanner;
import java.util.regex.Pattern;

public class CodeChecker {
    static int code = authenticationEmailChecker.codeReturn();
    static Scanner sc = new Scanner(System.in);
    static String emailChecker(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        System.out.println("Enter your email");

        String ver_email = sc.next();
        if(pat.matcher(ver_email).matches() == false)
        {
            System.err.println("INVALID EMAIL ID");
            emailChecker();
        }
        return ver_email;
    }
    public static boolean main(String[] args) {
        String eemail = emailChecker();
        GmailMailSender.sendEmail(eemail , code);
        System.out.println("Sent mail to " + eemail);
        System.out.println("Enter the code ");
        if(sc.nextInt() == code)
            return true;

        return false;
    }
}
