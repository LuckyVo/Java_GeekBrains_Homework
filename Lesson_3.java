package geekbrains.lesson3;

/**
 * Java 1. Homework №3
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 18.01.2022г.
 *
 */

import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        arrays_1 ();
        arrays_2 ();
        arrays_3 ();
        arrays_4 ();
        arrays_5 (10,5);
        arrays_6 ();
        System.out.println(arrays_7_1 ());
        int arr7_2[] = {1,1,2,1,3};
        System.out.println(arrays_7_2 (arr7_2));
    }

    static void arrays_1 (){
        int  arr1 [] = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr1.length; i++) {
            arr1 [i] = arr1 [i] == 0? (arr1 [i] = 1) : (arr1 [i] = 0);
        }
        System.out.println(Arrays.toString(arr1));
    }

    static void arrays_2 (){
        int  arr2 [] = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2 [i] = i+1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void arrays_3 (){
        int  arr3 [] = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr3[i] < 6? (arr3[i] * 2) : (arr3[i] = arr3[i]);
        }
        System.out.println(Arrays.toString(arr3));
    }

    static void arrays_4 (){
        int  arr4 [][] = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++){
                System.out.print((i == j) || (i + j == arr4[i].length - 1)? (arr4[i][j] = 1) : (arr4[i][j] = 0));
            }
            System.out.println();
        }
    }

    static void arrays_5 (int len, int intivalValue){
        int  arr5 [] = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5 [i] = intivalValue;
        }
        System.out.println(Arrays.toString(arr5));
    }

    static void arrays_6(){
        int arr6 [] = new int[10];
        for (int i = 0; i < arr6.length; i++) {
            int rand = (int) (Math.random() * 100);
            arr6[i] = rand;
        }
        System.out.println("Массив чисел arr6 = " + Arrays.toString(arr6));

        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
             max = arr6[i] > max? (max = arr6[i]) : (max = max);

        }
        System.out.println("Максимальное число из массива чисел arr6: " + max);

        int min = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            min = arr6[i] < min? (min = arr6[i]) : (min = min);

        }
        System.out.println("Минимальное число из массива чисел arr6: " + min);
    }

    /**static boolean arrays_7_1(){
        int arr7_1 [] = new int[10];
        for (int i = 0; i < arr7_1.length; i++) {
            int rand = (int) (Math.random() * 100);
            arr7_1[i] = rand;
        }
        System.out.println("Массив чисел arr7_1 = " + Arrays.toString(arr7_1));

        int leftsum = 0;
        for (int i = 0; i < (arr7_1.length/2); i++) {
            leftsum += arr7_1[i];
        }
        System.out.println("Сумма левой части = " + leftsum);

        int rightsum = 0;
        for (int i = (arr7_1.length/2); i < arr7_1.length; i++) {
            rightsum += arr7_1[i];
        }
        System.out.println("Сумма правой части = " + rightsum);

        return leftsum == rightsum;
    }*/

    static boolean arrays_7_1(){
        int arr7_1 [] = new int[10];
        for (int i = 0; i < arr7_1.length; i++) {
            int rand = (int) (Math.random() * 100);
            arr7_1[i] = rand;
        }
        System.out.println("Массив рандомных чисел arr7_1 = " + Arrays.toString(arr7_1));
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < arr7_1.length; i++) {
            rightsum += arr7_1[i];
        }
        for (int i = 0; i < arr7_1.length; i++) {
            if (leftsum == rightsum) {
                return true;
            }
            leftsum += arr7_1[i];
            rightsum -= arr7_1[i];
        }
        return false;


    }

    static boolean arrays_7_2(int arr7_2[]){
        System.out.println("Массив числе arr7_2 = " + Arrays.toString(arr7_2));
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < arr7_2.length; i++) {
            rightsum += arr7_2[i];
        }
        for (int i = 0; i < arr7_2.length; i++) {
            if (leftsum == rightsum) {
                return true;
            }
            leftsum += arr7_2[i];
            rightsum -= arr7_2[i];
        }
        return false;
    }



}




