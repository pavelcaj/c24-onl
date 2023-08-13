package lesson4.hw4;

import lesson4.Main;

public class Hw4 {
    /**
     * Задача 4:
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет.
     */
    public static void main(String[] args) {

        //создаем массив

        int[] mass = Main.array();

        // создаем счетчик нулей

        int count = 0;

        // ищим нули циклом и по условия выводим сообщения пользователю

        for (int x : mass) {
            if (x == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нулей в массиве нет");
        } else {
            System.out.println("Нулей в массиве " + count);
        }
    }
}
