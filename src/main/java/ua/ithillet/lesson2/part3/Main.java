package ua.ithillet.lesson2.part3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.1F);
        Triangle triangle = new Triangle(3, 5, 6);
        Square square = new Square(9);

        circle.areaFigure();
        triangle.areaFigure();
        square.areaFigure();

        float sum = 0;
        Area[] figures = {new Circle(2.1F),new Triangle(3, 5, 6), new Square(9) };
        for (Area figure : figures) {
           sum+= figure.areaFigure();
        }
        System.out.println(sum);
    }
}
