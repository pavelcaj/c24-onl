package lesson10.line;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Logic {
    static StringBuilder sb = new StringBuilder();
    static String[] words;

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку без пробелов, если хотите выйти напишите нажмите 1");
            String str = sc.next();
            if (str.equals("1")) {
                break;
            } else {
                sb.append(str + " ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void maxAndMinWords() {
        String[] words = sb.toString().split(" ");

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое короткое слово: " + shortestWord);
        System.out.println("Самое длинное слово: " + longestWord);
    }

    public static void increasing() {
        sortedString(sb.toString());
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Arrays.sort(words, lengthComparator);
        System.out.println("строки в порядке возрастания");
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void lessAverage() {
        int middleIndex = words.length / 2;
        if (words.length % 2 == 0) {
            middleIndex--;
        }
        String middleString = words[middleIndex];
        System.out.println("Центральное слово: " + middleString);

        for (String s : words) {
            if (s.length() <= middleString.length() && s != middleString) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    public static void uniqueWords() {
        System.out.println("Уникальное слово");
        for (String s : words) {
            char[] chars = s.toCharArray();
            boolean flag = true;
            for (int i = 0; i < chars.length; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("Найдено слово, состоящее только из различных символов: " + s);
                break;
            }
        }
    }

    public static void doubleWords() {
        String input = sb.toString();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                output.append(c);
            } else {
                output.append(c);
                output.append(c);
            }
        }
        System.out.println(output.toString());
    }


    public static String[] sortedString(String sb) {
        return words = sb.split("\\s+");
    }
}


