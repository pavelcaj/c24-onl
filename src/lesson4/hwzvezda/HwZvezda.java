package lesson4.hwzvezda;

import java.util.Arrays;

public class HwZvezda {
    /**
     * Задача *:
     * Имеется массив из неотрицательных чисел(любой). Представьте что массив
     * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
     * добавить единицу к этому "числу" и на выходе получить исправленный массив. Массив не
     * содержит нуля в начале, кроме самого числа 0.
     * Пример:
     * Вход: [1,4,0,5,6,3]
     * Выход: [1,4,0,5,6,4]
     * Вход: [9,9,9]
     * Выход: [1,0,0,0]
     */
    public static void main(String[] args) {

        //создаем массив + переменную в которую будем склеивать числа массива

        int[] mass = new int[]{1, 9, 9, 8};
        int[] z = new int[mass.length + 1];
        int[] reversZ = new int[mass.length + 1];
        int[] c = new int[mass.length];
        int[] reversC = new int[mass.length];
        String s = "";
        String sBefore = "";

        System.out.println(Arrays.toString(mass));
        //склеиваем числа масива

        for (int x : mass) {
            s = s + x;
        }

        //создаем переменную в которой строка превращается в число
        //добовляем +1

        int a = Integer.parseInt(s);
        a = a + 1;
        sBefore = String.valueOf(a);

        //проверяем увеличилось ли число на разряд
        //засовываем числа в массив

        if (sBefore.length() > s.length()) {
            for (int i = 0; i < z.length; i++) {
                z[i] = a % 10;
                a /= 10;
            }

            //переварачиваем массив

            for (int i = 0; i < z.length; i++) {
                reversZ[mass.length - i] = z[i];
            }

            //выводим правельный массив

            System.out.println(Arrays.toString(reversZ));


        } else {

            //засовываем числа в массив

            for (int i = 0; i < c.length; i++) {
                c[i] = a % 10;
                a /= 10;
            }

            //переварачиваем массив

            for (int i = 0; i < c.length; i++) {
                reversC[mass.length - 1 - i] = c[i];
            }

            System.out.println(Arrays.toString(reversC));

        }
    }
}

