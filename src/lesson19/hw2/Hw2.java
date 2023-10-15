package lesson19.hw2;

import java.util.Arrays;

/**
 * Сортировка массива цифр в нескольких потоках различными алгоритмами:
 *  сортировка вставками;
 *  сортировка выбором;
 *  сортировка пузырьком.
 * Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
 * результат отсортированных массивов в консоль
 */
public class Hw2 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 10, 11, 2, 500, 255, 77, 3, 9, 100, 1000, 5000, 1000, 10000, 11};
        int[] mass1 = {1, 2, 3, 10, 11, 2, 500, 255, 77, 3, 9, 100, 1000, 5000, 1000, 10000, 11};
        int[] mass2 = {1, 2, 3, 10, 11, 2, 500, 255, 77, 3, 9, 100, 1000, 5000, 1000, 10000, 11};

        Thread insertionThred = new Thread(() -> {
            for (int i = 1; i < mass.length; i++) {
                int key = mass[i];
                int j = i - 1;
                while (j >= 0 && mass[j] > key) {
                    mass[j + 1] = mass[j];
                    j = j - 1;
                }
                mass[j + 1] = key;
            }
            System.out.println("Сортировка вставками " + Arrays.toString(mass));
        });

        Thread sekectionThread = new Thread(() -> {
            for (int i = 0; i < mass1.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < mass1.length; j++) {
                    if (mass1[j] < mass1[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = mass1[minIndex];
                mass1[minIndex] = mass1[i];
                mass1[i] = temp;
            }
            System.out.println("Сортировка выбором" + Arrays.toString(mass1));
        });

        Thread bubbleThread = new Thread(() -> {
            boolean swapped;

            for (int i = 0; i < mass2.length - 1; i++) {
                swapped = false;

                for (int j = 0; j < mass2.length - i - 1; j++) {
                    if (mass2[j] > mass2[j + 1]) {
                        int temp = mass2[j];
                        mass2[j] = mass2[j + 1];
                        mass2[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
            System.out.println("Пузырьковая сортировка " + Arrays.toString(mass2));
        });

        sekectionThread.start();
        insertionThred.start();
        bubbleThread.start();


    }
}
