package lesson4.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] mass = new int[]{1, 12, 12, 11, 7, 9, 4, 5,};
        mergeSort(mass, 0, mass.length - 1);
        System.out.println(Arrays.toString(mass));

    }

    public static void mergeSort(int[] source, int left, int right) {

        // Выберем разделитель, т.е. разделим пополам входной массив

        int delimiter = left + ((right - left) / 2) + 1;

        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(

        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }

        // Создаём временный массив с нужным размером

        int[] buffer = new int[right - left + 1];

        // Начиная от указанной левой границы идём по каждому элементу

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {

            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов

            if (delimiter > right || source[cursor] < source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }
}

