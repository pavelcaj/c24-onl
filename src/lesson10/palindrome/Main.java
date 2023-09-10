package lesson10.palindrome;

import java.util.Scanner;

/**
 Дана строка произвольной длины с произвольными словами. Написать программу для
 проверки является ли любое выбранное слово в строке палиндромом.
 Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
 слово в этой строке палиндромом.
 Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
 в строке 5 слов, а на вход программе передали число 500
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");
        System.out.println("Введите номер слова, которое нужно проверить на палиндром: ");
        int wordIndex = scanner.nextInt();
        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: в строке всего " + words.length + " слов, а вы ввели " + wordIndex);
            return;
        }
        String wordToCheck = words[wordIndex - 1];
        if (isPalindrome(wordToCheck)) {
            System.out.println("Слово '" + wordToCheck + "' палиндром");
        } else {
            System.out.println("Слово '" + wordToCheck + "' не палиндром");
        }
    }

    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

