package lesson17.hw1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 только из прописных букв, без чисел.
 */
public class Hw1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку: ");
    String input = scanner.nextLine();


    String regex = "\\b[A-Z]{2,6}\\b";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

        System.out.println("Аббревиатуры в строке:");
        while (matcher.find()) {
        String abbreviation = matcher.group();
        System.out.println(abbreviation);
    }

        scanner.close();
}
}

