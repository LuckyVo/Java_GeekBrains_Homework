package geekbrains.lesson2;

/**
 * Java 1. Homework №2
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 13.01.2022г.
 *
 */

import java.util.Scanner;

public class Lesson_2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        comparingNumbers(5, 7);
        determiningIntegrityNumber(-8);
        System.out.println(determiningIntegrityNumberSecond(-8));
        cycle("Lesson №2; ", 3);
        System.out.println("\nПроверьте код на високосность.");
        System.out.println(checkingYear());
    }

    static void comparingNumbers (int a, int b) {
        int c = a + b;
        System.out.println( c >= 10 && c <= 20? "true" : "false");
    }

    static void determiningIntegrityNumber (int a){
        System.out.println( a >= 0? "Положительное" : "Отрицательное");
    }

    static boolean determiningIntegrityNumberSecond(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void cycle (String word, int a){
        for (int i = 0; i < a; i++){
            System.out.print(word);
        }
    }

    static boolean checkingYear () {
        System.out.print("Введите год:");
        int userYear = scanner.nextInt();
        if (userYear%4 == 0 && userYear%100 != 0) {
            return true;
        } else if (userYear%400 == 0 && userYear%100 != 0){
            return true;
        } return false;
        }
}
