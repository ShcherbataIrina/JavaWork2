package ua.ithillet.lesson2.part2;

public class Main {
    public static void main(String[] args) {
        Animal animalTom = new Animal();
        Dog dogBont = new Dog();
        Cat catMilli = new Cat();

        animalTom.run("Tom",532);
        animalTom.swim("Tom",20);
        dogBont.run("Bont", 224);
        dogBont.swim("Bont",9);
        catMilli.run("Milli",198 );
        catMilli.swim("Milli", 8);
    }
}
