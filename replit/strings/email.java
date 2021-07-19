package strings;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String email = scan.next();

        String firstName= email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_"), email.indexOf("@"));
        String domain =  email.substring( email.indexOf("@"), email.lastIndexOf("."));

        System.out.println(domain.substring(0,1).toUpperCase() + domain.substring(1));
        }
    }

