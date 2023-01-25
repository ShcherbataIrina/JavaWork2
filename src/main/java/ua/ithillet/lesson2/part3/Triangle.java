package ua.ithillet.lesson2.part3;

public class Triangle implements Area{
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private int p;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float areaFigure() {
        p= (sideA + sideB + sideC)/2;
        return (float) Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

    }
}
