package day43_OOP_Encapsulation;

public class Credentials {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        boolean startsWithLetter = Character.isLetter(username.charAt(0));
        if (!startsWithLetter|| username.length()<5){
            System.out.println("Name should start with letter");
            return;
        }
        this.username = username;
    }

    public void setPassword(String password) {

        if(!isStrongPassword(password)){
            System.out.println("Is not a strong password");
            return;
        }
        this.password = password;
    }

    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ") && !password.contains(",");
        boolean r2 = false,
                r3 = false,
                r4 = false;

        for (char c : password.toCharArray()) {

            if (Character.isLetter(c)) {
                r2 = true;
            } else if (Character.isDigit(c)) {
                r3 = true;
            } else if (!Character.isLetterOrDigit(c)) {
                r4 = true;
            }


        }


        return r1 && r2 && r3 && r4;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(String username, String password) {
      setPassword(password);
      setUsername(username);
    }
}
