package ua.ithillet.lesson2.part3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.1F);
        Triangle triangle = new Triangle();
        Square square = new Square();


        triangle.areaTriangle(3, 5, 6);
        square.areaSquare(9);
        circle.areaFigure();
        triangle.areaFigure();
        square.areaFigure();

        float sum = 0;
        Area[] figures = {new Circle(2.1F)};
        for (Area figure : figures) {
           sum+= figure.areaFigure();
        }
        System.out.println(sum);
    }
}
