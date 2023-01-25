package ua.ithillet.lesson2.part3;

public class Triangle implements Area{
    private int sideA;
    private int sideB;
    private int sideC;
    private int p;
    private float area;
    public void areaTriangle(int sideA, int sideB, int sideC){
    p= (sideA + sideB + sideC)/2;
    area= (float) Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

    }
    @Override
    public void areaFigure() {
        System.out.printf("\nПлоща трикутника %f", area );
    }
}
