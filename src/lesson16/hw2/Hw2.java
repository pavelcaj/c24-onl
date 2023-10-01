package lesson16.hw2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
 этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
 Среди отобранных значений отобрать только те, которые имеют нечетное количество
 букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 */
public class Hw2 {
    public static void main(String[] args) {
        Map<Integer, String > dataMap = new HashMap<>();
    dataMap.put(1, "Aigul");
    dataMap.put(2, "Artem");
    dataMap.put(9,"Pasha");
    dataMap.put(3,"Roshen");

        List<Integer> integerID = List.of(1, 2, 5, 8, 9, 13);

        List<String> filteredNames = dataMap.entrySet().stream()
                .filter(entry -> integerID.contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());

        System.out.println("Имена, записанные задом наперед: " + filteredNames);

    }
    }

