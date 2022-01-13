package geekbrains.lesson1;

/**
 * Java 1. Homework №1
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 12.01.2022г.
 *
 */

public class Lesson_1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2;
        int b = -5;
        int c = a + b;
        System.out.println(c >= 0? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 2;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 2;
        int b = -5;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}


