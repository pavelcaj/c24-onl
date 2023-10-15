package lesson19.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Задача 1:
 * Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
 * потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
 * вычислений возвращаются в метод main()
 */
public class Hw1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("В ведите число в массив");
            System.out.println("Чтобы выйти нажмите E");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();

            if (x.equals("e")) {
                break;
            } else {
                int z = Integer.parseInt(x);
                list.add(z);
            }
        }

        Thread maxThread = new Thread(() -> {
            int max = list.isEmpty() ? Integer.MIN_VALUE : list.get(0);
            for (int num : list) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Максимум " + max);
        });

        Thread minThread = new Thread(() -> {
            int min = list.isEmpty() ? Integer.MAX_VALUE :list.get(0);
            for (int num : list) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Минимум " + min);
        });

        maxThread.start();
        minThread.start();

        try{
            maxThread.join();
            minThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}