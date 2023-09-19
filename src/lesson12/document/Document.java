package lesson12.document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача *:
 * Допустим есть txt файл с номерами документов. Номером документа является строка,
 * состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
 * номер документа с новой строки и в строке никакой другой информации, только номер
 * документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
 * последовательности docnum(далее любая последовательность букв/цифр) или
 * contract(далее любая последовательность букв/цифр). Написать программу для чтения
 * информации из входного файла - путь к входному файлу должен задаваться через
 * консоль. Программа должна проверять номера документов на валидность. Валидные
 * номера документов следует записать в один файл-отчет. Невалидные номера документов
 * следует записать в другой файл-отчет, но после номеров документов следует добавить
 * информацию о том, почему этот документ не валиден.
 */
public class Document {
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу");
        System.out.println("Путь к файлу D:\\c24-onl\\resourse\\lesson12\\Document.txt");

        File inputFile;
        File outputFileUnValid = new File("D:\\c24-onl\\resourse\\lesson12\\unValidDocument.txt");
        File outputFileValid = new File("D:\\c24-onl\\resourse\\lesson12\\validDocument.txt");

        try {
            Scanner sc = new Scanner(System.in);
            inputFile = new File(sc.nextLine());
            Scanner scanner = new Scanner(inputFile);

            FileWriter writerUnValid = new FileWriter(outputFileUnValid);
            FileWriter writerValid = new FileWriter(outputFileValid);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuilder reasons = new StringBuilder();

                if (line.length() < 15) {
                    reasons.append(" Документ меньше 15 символов;");
                }

                boolean unique = false;
                for (int x = 0; x < line.length(); x++) {
                    char currentChar = line.charAt(x);
                    if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)) {
                        unique = true;
                        break;
                    }
                }

                if (unique) {
                    reasons.append(" Документ содержит уникальный символ;");
                }

                if (reasons.length() > 0) {
                    writerUnValid.write(line + reasons.toString() + "\n");
                } else {
                    writerValid.write(line + "\n");
                }
            }

            writerUnValid.flush();
            writerUnValid.close();
            writerValid.flush();
            writerValid.close();

            System.out.println("Проверка документов завершена.");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл!");
        }
    }
}