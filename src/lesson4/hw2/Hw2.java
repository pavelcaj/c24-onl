package lesson4.hw2;

import lesson4.Main;

import java.util.Arrays;

public class Hw2 {
    /**
     * Найти минимальный-максимальный элементы и вывести в консоль.
     */
    public static void main(String[] args) {
        /* получаем массив из класса мэйн метод арей
         с помощью сортировки получаем масив последовательно возрастющих
         чисел и выводим первый и последний элемент отсортированного
         массива
        * */

        int[] mass = Main.array();
        int i = mass.length - 1;

        System.out.println("Массив до сортировка:" + Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println("Массив после сортировки: " + Arrays.toString(mass));
        System.out.println("Минимальное значение массива: " + mass[0]);
        System.out.println("Максимальное значение массива: " + mass[i]);
    }
}


