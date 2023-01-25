package ua.ithillet.lesson2.part1;

public class Main {
    public static void main(String[] args) {

        Employee oleg = new Employee("Олег", "продавець", "oleg@gmail.com", "0938754612", 23);
        Employee olena = new Employee("Олена", "адміністратор", "lena@gmail.com", "0632436981", 31);
        System.out.println(oleg);

        Car car = new Car();
        car.start();

        SameName sameName = new SameName();
        ua.ithillet.lesson2.part1.test.SameName sameName1 = new ua.ithillet.lesson2.part1.test.SameName();

    }

}
