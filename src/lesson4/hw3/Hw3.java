package lesson4.hw3;

import lesson4.Main;

public class Hw3 {
    /**
     * Задача 3:
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public static void main(String[] args) {
        // создаем массив с помощью метода

        int[] mass = Main.array();

        //создаем переменые для поиска позиции максимального и минимального элемента

        int min = mass[0], max = mass[0];

        // находим минимальное максимальное значение

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }

        System.out.println();

        // находим индексы и выводи

        for (int i = 0; i < mass.length; i++) {
            if (min == mass[i]) {
                System.out.println("Индекс минимального элемента массива: mass[" + i + "]");
            }
            if (max == mass[i]) {
                System.out.println("Индекс максимального  элемента массива: mass[" + i + "]");
            }
        }
    }
}
