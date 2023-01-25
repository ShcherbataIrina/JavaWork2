package ua.ithillet.lesson2.part2;

public class Cat extends Animal{
    private  String nameOfAnimal;
    private int lenght;

    public void run(String nameOfAnimal, int lenght){
        if(lenght <= 200 ) {
            System.out.printf("\nКіт %s пробіг %d м. ", nameOfAnimal, lenght);
        } else  System.out.printf("\nЗанадто велика відстань для кота %s. ", nameOfAnimal);
    }
    public void swim(String nameOfAnimal, int lenght){
        System.out.printf("\nКіт %s не вміє плавати. ", nameOfAnimal);
    }
}
