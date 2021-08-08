public class StrongPassword {
    public static void main(String[] args) {

        String password = "22072008Vv.";
        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        if (password.toCharArray().length >= 8 && !password.contains(" ")) {
            r5 = true;
        }

        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                r1 = true;

            } else if (Character.isLowerCase(each)) {
                r2 = true;
            } else if (Character.isDigit(each)) {
                r3 = true;
            } else {
                r4 = true;
            }

        }

        boolean isStrongPassword = false;
        if (r1 && r2 && r3 && r4 && r5) {
            isStrongPassword = true;
        }
        System.out.println("isStrongPassword = " + isStrongPassword);


    }
}
