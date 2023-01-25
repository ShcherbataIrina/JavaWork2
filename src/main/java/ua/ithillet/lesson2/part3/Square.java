package ua.ithillet.lesson2.part3;

public class Square implements Area{
    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float areaFigure() {
        return side * side;
    }
}
