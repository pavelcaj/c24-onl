package lesson16.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
 * Stream'ов:
 * - Удалить дубликаты
 * - Оставить только четные элементы
 * - Вывести сумму оставшихся элементов в стриме
 */
public class Hw1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 5, 5, 6, 7, 8);
        int sum = list.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer:: intValue)
                .sum();

        System.out.println(sum);

    }
}
