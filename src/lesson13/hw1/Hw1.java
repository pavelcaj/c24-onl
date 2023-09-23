package lesson13.hw1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
 При решении использовать коллекции
 */
public class Hw1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите набор чисел в виде строки в формате 1, 2, 3," +
                    " 4, 4, 5");
            String input = scanner.nextLine();

            String[] numbersArray = input.split(",\\s*");



            ArrayList<String> numericValues = new ArrayList<>();

            for (String number : numbersArray) {
                if (isNumeric(number)) {
                    numericValues.add(number);
                } else {
                    System.out.println("Ошибка: " + number + " не является числом и будет проигнорировано.");
                }
            }

            System.out.println("Оставляем уникальные числа ");
            for (String uniqueNumber : new HashSet<>(numericValues)) {
                System.out.print(uniqueNumber + " ");
            }
        }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}