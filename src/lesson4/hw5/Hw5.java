package lesson4.hw5;

import lesson4.Main;

public class Hw5 {
    /**
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д
     */
    public static void main(String[] args) {

        //создаем два массива

        int[] mass = Main.array();
        int[] reversMass = new int[mass.length];

        // выводим первый массив, а во втором меняем значения по условю

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            reversMass[mass.length - 1 - i] = mass[i];
        }

        // выводим второй массив

        System.out.println();
        for (int x : reversMass) {
            System.out.print(x + " ");
        }
    }
}
