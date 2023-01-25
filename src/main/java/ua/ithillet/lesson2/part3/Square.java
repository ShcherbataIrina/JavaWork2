package ua.ithillet.lesson2.part3;

public class Square implements Area{
    private float side;
    private float area;
    public void areaSquare(float side) {
        area= side * side;
    }
    @Override
    public float areaFigure() {
        System.out.printf("\nПлоща квадрату %f", area );
    }
}
