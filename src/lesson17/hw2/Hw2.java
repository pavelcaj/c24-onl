package lesson17.hw2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Программа на вход получает произвольный текст. В этом тексте может быть номер
 документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 может содержать не всю информацию, т.е. например, может не содержать номер
 телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
 формате:
 email: teachmeskills@gmail.com
 document number: 1423-1512-51
 и т.д
 */

public class Hw2 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите произвольный текст: ");
            String inputText = scanner.nextLine();

            // Регулярные выражения для поиска номеров документов, адресов электронной почты и номеров телефонов
            String docNumberRegex = "\\d{4}-\\d{4}-\\d{2}";
            String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
            String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}";

            Pattern docNumberPattern = Pattern.compile(docNumberRegex);
            Pattern emailPattern = Pattern.compile(emailRegex);
            Pattern phonePattern = Pattern.compile(phoneRegex);

            Matcher docNumberMatcher = docNumberPattern.matcher(inputText);
            Matcher emailMatcher = emailPattern.matcher(inputText);
            Matcher phoneMatcher = phonePattern.matcher(inputText);

            // Поиск и вывод информации
            while (docNumberMatcher.find()) {
                System.out.println("document number: " + docNumberMatcher.group());
            }

            while (emailMatcher.find()) {
                System.out.println("email: " + emailMatcher.group());
            }

            while (phoneMatcher.find()) {
                System.out.println("phone number: " + phoneMatcher.group());
            }

            scanner.close();
        }
    }



