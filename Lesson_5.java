package geekbrains.lesson5;

/**
 * Java 1. Homework №5
 *
 * @author: Кудрявцев Владимир Сергеевич
 * @version: 25.01.2022г.
 *
 */

public class Lesson_5 {


    public static void main(String[] args) {

        Employee employee[] = new Employee [5];

        employee[0] = new Employee ("Иванов Иван Иванович", "Директор", "ivan@mail.bu", 89995551188L, 555555, 65);
        employee[1] = new Employee ("Петров Петр Петрович", "Зам. директора", "petrov@mail.bu", 89991111188L, 444444, 55);
        employee[2] = new Employee ("Годунов Петр Иванович", "Бухгалтер", "godunov@mail.bu", 89992221188L, 333333, 45);
        employee[3] = new Employee ("Соколов Иван Петрович", "Менеджер", "sokolov@mail.bu", 89993331188L, 222222, 35);
        employee[4] = new Employee ("Сидоров Петр Иванович", "Секретарь", "sidorov@mail.bu", 89994441188L, 111111, 25);


        for (int i = 0; i < employee.length; i++){
            if (employee[i].age > 40) {
                System.out.println(employee[i].toPrint());
            }
        }
    }

}

class Employee {

    public String fullName;
    public String post;
    public String email;
    public long tel;
    public int salary;
    public int age;

    Employee (String fullName, String post, String email, long tel, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String toPrint() {
            return "Сотрудник: " + fullName + ", " + post + ", " + email + ", " + tel + ", " + salary + ", " + age;
    }


}
