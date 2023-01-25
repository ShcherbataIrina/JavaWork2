package ua.ithillet.lesson2.part1;

public class Car {

    public void start(){
        System.out.println("Початок роботи автомобіля.");
        startFuelSystem();
        startCommand();
        startElectricity();

    }
        private void startElectricity(){
            System.out.println("Запуск електросистеми.");
        }

        private void startCommand(){
            System.out.println("Виконується команда.");
        }

        private void startFuelSystem(){
            System.out.println("Працює паливна система.");
        }

}
