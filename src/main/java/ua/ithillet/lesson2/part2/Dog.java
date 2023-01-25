package ua.ithillet.lesson2.part2;

public class Dog extends Animal{
    private  String nameOfAnimal;
    private int lenght;
    public void run(String nameOfAnimal, int lenght){
        if(lenght <= 500 ) {
            System.out.printf("\nСобака %s пробіг %d м. ", nameOfAnimal, lenght);
        }
        else  System.out.printf("\nЗанадто велика відстань для собаки %s. ", nameOfAnimal);
    }

    public void swim(String nameOfAnimal, int lenght){
        if(lenght <= 10 ) {
        System.out.printf("\nСобака %s проплив %d м. ",nameOfAnimal,lenght);
    }
        else  System.out.printf("\nЗанадто велика відстань для собаки %s. ", nameOfAnimal);
    }
}