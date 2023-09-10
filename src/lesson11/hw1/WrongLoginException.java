package lesson11.hw1;

import java.sql.SQLOutput;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {

    }
}
