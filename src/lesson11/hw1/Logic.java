package lesson11.hw1;

public class Logic {
    public static void loginLength(String login) throws WrongLoginException {
        if (login.length() != 20) {
            throw new WrongLoginException("Не правильная длинная логина");

        }

    }

    public static void checkPassword(String password) throws WrongPasswordException {
        checkLengthPassword(password);
        checkPasswordUniqueSymbol(password);
    }

    public static void checkLengthPassword(String password) throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException("Длинна пароля больше или равна 20");
        }
    }

    public static void checkPasswordUniqueSymbol(String password) throws WrongPasswordException {
        StringBuilder sb = new StringBuilder(password);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                throw new WrongPasswordException("Пароль содержит пробелы");
            }
            if (Character.isDigit(sb.charAt(i))) {
                count++;
            }
        }
        if (count == 0) {
            throw new WrongPasswordException("Пароль не содержит цифр");
        }
    }

    public static void checkPasswordAndConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password != confirmPassword) {
            throw new WrongPasswordException("Пароли не совподают");
        }
    }
}
