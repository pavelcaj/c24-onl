package lesson15.hw3;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Используя Function реализовать лямбду, которая будет принимать в себя строку в
 * формате "*сумма* BYN"(через пробел, вместо *сумма* вставить любое значение), а
 * возвращать сумму, переведенную сразу в доллары.
 */
public class Hw3 {
    public static void main(String[] args) {
        System.out.print("Введите значение Byn");
        Scanner scanner = new Scanner(System.in);
        double inputValue = scanner.nextInt();

        Function<Double, Double> dolars = x -> x / 3.25;
        double result = dolars.apply(inputValue);

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedNumber = df.format(result);
        System.out.println("В долларах это " + formattedNumber);
    }
}
