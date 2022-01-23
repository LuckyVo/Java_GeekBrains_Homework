package geekbrains.lesson4;

/**
 * Java 1. Homework №4
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 21.01.2022г.
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Lesson4_TicTacToe_3х3 {

    Random random;
    Scanner scanner;
    char[][] gameField;
    final char CHAR_O = 'o';
    final char CHAR_X = 'x';
    final char CHAR_TABLE = '.';

    public static void main(String[] args) {
        new Lesson4_TicTacToe().game();
    }

    Lesson4_TicTacToe (){
        gameField = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game(){
        initTable();
        printTable();
        while (true){
            turnHuman();
            if (checkWin(CHAR_X)){
                System.out.println("Ты победил!");
                break;
            }
            if (isGameFieldFull()){
                System.out.println("Ничья...");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(CHAR_O)){
                System.out.println("Победил компьютер!");
                break;
            }
            if (isGameFieldFull()){
                System.out.println("Ничья...");
                break;
            }
        }
        System.out.println("Конец игры");
        printTable();
    }

    void initTable (){
        for (int x = 0; x < gameField.length; x++){
            for (int y = 0; y < gameField[x].length; y++){
                gameField[x][y] = CHAR_TABLE;
            }
        }
    }

    void printTable (){
        for (int x = 0; x < gameField.length; x++){
            for (int y = 0; y < gameField[x].length; y++){
                System.out.print(gameField[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman (){
        int x, y;
        do {
            System.out.print("Введите числа через пробел [1..3]: ");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        } while (!isCellValid(x, y));
        gameField[x][y] = CHAR_X;
    }

    void turnAI(){
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        gameField[x][y] = CHAR_O;
    }

    boolean isCellValid (int x, int y) {
        if (x < 0 || y < 0 || x > (gameField.length-1) || y > (gameField.length-1)) {
            return false;
        }
        return gameField[x][y] == CHAR_TABLE;
    }

    boolean checkWin (char ch){
        for ( int i = 0; i < gameField.length; i++) {
            if ((gameField[i][0] == ch && gameField[i][1] == ch && gameField[i][2] == ch) || (gameField[0][i] == ch && gameField[1][i] == ch && gameField[2][i] == ch))
                return true;
        }
        if (gameField[0][0] == ch && gameField[1][1] == ch && gameField[2][2] == ch) return true;
        if (gameField[0][2] == ch && gameField[1][1] == ch && gameField[2][0] == ch) return true;
        return false;
    }

    boolean isGameFieldFull () {
        for (int x = 0; x < gameField.length; x++){
            for (int y = 0; y < gameField[x].length; y++){
                if (gameField[x][y] == CHAR_TABLE){
                    return false;
                }
            }
        }
        return true;
    }


}
