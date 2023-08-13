package lesson4.zd3;

import java.util.Scanner;

/**
 * Задача 3:
 * 3.1 Создать пустой массив типа double с названием masDouble такого размера, который
 * пользователь вводит с клавиатуры.
 * 3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
 * консоль.
 * 3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
 * обратном порядке
 */
public class Zd3 {
    public static void main(String[] args) {
        // Общаемся с пользователем говорим что хотим отнего
        // + делаем защиту от дурака

        System.out.println("Введите целое положительно число");
        Scanner sc = new Scanner(System.in);
        int t;

        while (true) {
            try {
                t = sc.nextInt();
                if (t < 0) {
                    System.out.println("Введите целое положительное число");
                    sc.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Введите целое положительное число число");
                sc.nextLine();
            }
        }

        // говорим что происходит

        System.out.println("Выводим массив ");

        //создаем 2 массива один по заданию
        // второй для души

        double[] masDouble = new double[t];
        String[] s = new String[t];

        // заполняем масив 1
        // второй переводим в нормальный формат и выводим

        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random() * 100;
            s[i] = formatDouble(masDouble[i]);
            System.out.print(s[i] + " ");
        }

        // говорим что происходит
        System.out.println();
        System.out.println("Возводим каждое второй элемент в квадрат и выводим ");

        //  Возводим каждый второй элемент в квадрат и выводим в нормальном формате

        for (int i = 0; i < s.length; i++) {
            if (i % 2 != 0) {
                masDouble[i] = Math.pow(masDouble[i], 2);
                s[i] = formatDouble(masDouble[i]);
                System.out.print(s[i] + " ");
            }
        }

        // говорим что происходит

        System.out.println();
        System.out.println("Выводим массив в обратном порядке");

        //выводим масив в обратном порядке в нормальном формате

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }

    // создаем метод перевода тип дабл в тип стринг с 3 символами
    // после запятой что бы в консоле всё красиво выводилось

    public static String formatDouble(double x) {
        return String.format("%.3f", x);
    }
}
