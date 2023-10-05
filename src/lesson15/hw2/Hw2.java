package lesson15.hw2;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Используя предикат среди массива чисел вывести только те, которые являются
 * положительными
 */
public class Hw2 {
    public static void main(String[] args) {
        int[] mass = {-1, -2, 3, 4, -3, -1, 5, -5, 2, -4};

        System.out.println("Массив до");
        System.out.println(Arrays.toString(mass));

        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println("Массив после");

        for (Integer number : mass) {
            if (isPositive.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}