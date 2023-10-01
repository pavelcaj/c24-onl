package lesson15.hw4;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
 * формате "*сумма* BYN"(через пробел, вместо *сумма* вставить любое значение), а
 * выводить сумму, переведенную сразу в доллары.
 */
public class Hw4 {
    public static void main(String[] args) {
        System.out.print("Введите значение Byn");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextInt();

        Consumer<Double> inputValue = x -> {

            DecimalFormat df = new DecimalFormat("#.##");
            String formattedNumber = df.format(x / 3.25);
            System.out.println("В долларах это " + formattedNumber);
        };
        inputValue.accept(input);
    }

}
