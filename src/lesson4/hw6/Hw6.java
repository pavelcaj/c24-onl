package lesson4.hw6;

import lesson4.Main;

public class Hw6 {
    /**
     * Задача 6:
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего)
     */
    public static void main(String[] args) {

        //создаем масив, переменную с помощью которой будем проверять массив

        int[] mass = Main.array();
        int count = 1;

        // прописываем логику проверки

        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < mass[i + 1]) {
                System.out.println("Массив не возрастающий");
                break;
            }
            count++;
        }

        if (count == mass.length) {
            System.out.println("Массив последовательно возрастающий");
        }
    }
}
