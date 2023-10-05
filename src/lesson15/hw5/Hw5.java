package lesson15.hw5;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 Используя Supplier написать метод, который будет возвращать введенную с консоли
 строку задом наперед.
 */
public class Hw5 {
    public static void main(String[] args) {

        Supplier<String> reverseInput = () -> {
            System.out.print("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();
            return new StringBuilder(input).reverse().toString();
        };

        String reversedString = reverseInput.get();
        System.out.println("Строка задом наперед: " + reversedString);
    }
}