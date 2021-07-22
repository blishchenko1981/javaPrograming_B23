package day34_LocalDateTime_Wrapper;

import java.util.zip.CheckedInputStream;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "pas 1!sword";

        boolean r1 = password.length()>= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        for (char each : password.toCharArray()) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(
                Character.isLowerCase(each)){
                    r3 = true;
                }else if(Character.isDigit(each)){
                r4 = true;
            }else {
                r5 = true;
            }
            }
        boolean isStrongPassword = r1&&r2&&r3&&r4&&r5;
        System.out.println(isStrongPassword);

        if(!r1){
            System.out.println("password does nOt have 8 digits or it has space");
        }
        if(!r2){
            System.out.println("password does Not have UpperCase letter");
        }
        if(!r3){
            System.out.println("password does Not have LowerCase letter");
        }

        if(!r4){
            System.out.println("NO DIGITS");
        }
        if(!r5){
            System.out.println("NO special characters");
        }

        }


    }

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one letter
                3. Password should at least contain one special characters
                4. Password should at least contain a digit
 */