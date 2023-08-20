package lesson6.ATM;

import lesson6.ATM.ATM.*;
import lesson6.ATM.Main.*;

import java.util.Random;
import java.util.Scanner;

public class Logic {
    public static int logic() {

        Scanner sc = new Scanner(System.in);
        int t;

        while (true) {
            try {
                t = sc.nextInt();
                if (t < 0) {
                    System.out.println("Введите целое положительное число");
                    sc.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Введите целое положительное число число");
                sc.nextLine();
            }
        }
        return t;
    }

    public static int random() {

        Random r = new Random();
        int xR = r.nextInt(10);
        return xR;
    }
}