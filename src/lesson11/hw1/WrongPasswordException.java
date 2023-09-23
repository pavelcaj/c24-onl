package lesson11.hw1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {

    }
}
