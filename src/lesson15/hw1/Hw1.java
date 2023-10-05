package lesson15.hw1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
 * когда пользователю исполнится 100 лет. Использовать API даты/времени
 */
public class Hw1 {
    public static void main(String[] args) {
        System.out.println("В ведите дату своего рождения ");
        System.out.println("Пожалуйста соблюдайте формат (гггг-мм-дд)");

        LocalDate birzdayDay = userInput();
        afterHungred(birzdayDay);
    }

    public static LocalDate userInput() {

        Scanner sc = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {

            String userInput = sc.nextLine();

            try {
                LocalDate birthDate = LocalDate.parse(userInput, formatter);

                if (birthDate.isBefore(currentDate) && birthDate.getYear() >= 1800) {
                    return birthDate;

                } else {
                    System.out.println("Пожалуйста соблюдайте формат (гггг-мм-дд)");
                }

            } catch (Exception e) {
                System.out.println("Ошибка: Некорректный формат даты.");
            }
        }
    }

    public static void afterHungred(LocalDate x) {

        System.out.println("Через сто лет после вашего рождения будет " + x.plusYears(100) + " дата");
    }
}