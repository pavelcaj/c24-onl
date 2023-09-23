package lesson11.hw1;

import jdk.swing.interop.SwingInterOpUtils;

public class Password {
    public static void addPasword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean exceptionOccurred = false;

        try {
            Logic.loginLength(login);
        } catch (WrongLoginException e) {
            e.printStackTrace();
            exceptionOccurred = true;
        }
        try {
            Logic.checkPassword(password);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            exceptionOccurred = true;
        }
        try {
            Logic.checkPasswordAndConfirmPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            exceptionOccurred = true;
        }


        if (!exceptionOccurred) {
            System.out.println(login + " " + password + " " + confirmPassword + " true");
        }
    }
}