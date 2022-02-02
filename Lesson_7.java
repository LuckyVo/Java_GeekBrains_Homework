package geekbrains.lesson7;

/**
 * Java 1. Homework №7
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 01.02.2022г.
 */

public class Lesson_7 {

    public static void main(String[] args) {

        Cat[] cat = {
            new Cat("Барсик", 5),
            new Cat("Мурзик", 4),
            new Cat("Диета", 1),
            new Cat("Обжора", 6)
        };

        Plate plate = new Plate(15);

        for (Cat cats : cat) {
            System.out.println(cats);
            System.out.println(plate);
            cats.isFull(plate);
            cats.eat(plate);
            System.out.println("Кот подошел к тарелке с целью поесть. " + plate);
            System.out.println(cats.info());
        }
        plate.addFood(15);
        System.out.println("Добавили еды в тарелку: " + plate);
    }
}

class Cat {
    private String nickName;
    private int appetite;
    public boolean isFull;

    Cat(String nickName, int appetite) {
        this.nickName = nickName;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isFull(Plate plate) {
        if (plate.fullFoods(appetite) == true){
            isFull = true;
            return isFull;
        } else {
            isFull = false;
            return isFull;
        }
    }

    @Override
    public String toString() {
        return "Кот по кличке: " + nickName + ", у которого аппетит: " + appetite + " порц.";
    }

    public String info(){
        if (isFull == true) {
            return "Кот по кличке " + nickName + " наелся.";
        } else {
            return "Кот по кличке " + nickName + " не поел.";
        }
    }

}

class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (appetite < food) {
            food -= appetite;
        } else {
            System.out.println("В тарелке нехватает порций.");
        }
    }

    public boolean fullFoods(int appetite) {
        if (food - appetite > 0) {
            return true;
        } else return false;
    }

    public void addFood(int food){
        this.food += food;
    }

    @Override
    public String toString() {
        return "В тарелке " + food + " порц.";
    }

}