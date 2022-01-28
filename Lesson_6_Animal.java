package geekbrains.lesson6;

/**
 * Java 1. Homework №6
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 28.01.2022г.
 *
 */

public class Lesson_6_Animal {

    public static void main(String[] args) {

        int count = 0;

        IAnimal animals[] = {
                new Cat("Мурзик", 100, 50),
                new Dog("Барбос", 100, 50)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.getRun());
            System.out.println(animal.getSwim());
            count++;
        }
        System.out.println("Создано животных: " + count);
    }
}

interface IAnimal {
    String toString();
    String getRun();
    String getSwim();
    }

abstract class Animal implements IAnimal {

    public String nickname;
    public int distanceRun;
    public int distanceSwim;

    public Animal (String nickname, int distanceRun, int distanceSwim){
        this.nickname = nickname;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public String getRun(){
        return "Пробежал дистанцию: " + distanceRun + "м.";
    }

    public String getSwim() {
        return "Проплыл дистанцию: " + distanceSwim + "м.";
    }
}

class Cat extends Animal{

    public Cat(String nickname, int distanceRun, int distanceSwim){
        super(nickname, distanceRun, distanceSwim);
    }

    @Override
    public String toString(){
        return "Котяра: "+ nickname;
    }

    public String getSwim(){
        return "Кошка плавать не умеет(";
    }
}

class Dog extends Animal{

    public Dog(String nickname, int distanceRun, int distanceSwim){
        super(nickname, distanceRun, distanceSwim);
    }

    @Override
    public String toString(){
        return "Собака: "+ nickname;
    }
}
