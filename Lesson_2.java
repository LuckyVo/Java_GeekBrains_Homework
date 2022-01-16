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
        System.out.println(comparingNumbers(5, 7));
        determiningIntegrityNumber(-8);
        System.out.println(determiningIntegrityNumberSecond(-8));
        cycle("Lesson №2; ", 3);
        System.out.println("\nПроверьте код на високосность.");
        System.out.println(checkingYear());
    }

    static boolean comparingNumbers (int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    static void determiningIntegrityNumber (int a){
        System.out.println( a >= 0? "Положительное" : "Отрицательное");
    }

    static boolean determiningIntegrityNumberSecond(int a) {
        return a < 0;
    }

    static void cycle (String word, int a){
        for (int i = 0; i < a; i++){
            System.out.print(word);
        }
    }

    static boolean checkingYear () {
        System.out.print("Введите год:");
        int userYear = scanner.nextInt();
        return (userYear%4 == 0 && userYear%100 != 0) || (userYear%400 == 0 && userYear%100 == 0);
        }
}
