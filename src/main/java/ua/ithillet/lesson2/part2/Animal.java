package ua.ithillet.lesson2.part2;

public class Animal {
    private  String nameOfAnimal;
    private int lenght;
    public void run(String nameOfAnimal, int lenght){
        System.out.printf("\nТварина %s пробіг %d м. ",nameOfAnimal,lenght);
    }
    public void swim(String nameOfAnimal, int lenght){
        System.out.printf("\nТварина %s проплив %d м. ",nameOfAnimal,lenght);
    }
}
