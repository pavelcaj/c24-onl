package lesson12.RomeoAndJuleta;
/**
 В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
 Проанализировать и записать в другой файл самое длинное слово.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RomeoAndJuletta {
    public static void main(String[] args) {
        String longestWord = "";
        try {

            File inputFile = new File("D:\\c24-onl\\resourse\\lesson12\\Romeo.txt");
            Scanner scanner = new Scanner(inputFile);


            StringBuilder textBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                textBuilder.append(scanner.nextLine() + "\n");
            }
            String text = textBuilder.toString();


            String[] words = text.split("\\s+");


            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }


            File outputFile = new File("D:\\c24-onl\\resourse\\lesson12\\longestWords.txt");
            FileWriter writer = new FileWriter(outputFile);
            writer.write(longestWord);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error while writing to file!");
        }
    }
}
