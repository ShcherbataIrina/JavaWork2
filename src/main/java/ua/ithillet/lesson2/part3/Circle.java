package ua.ithillet.lesson2.part3;

public class Circle implements Area{

    private final static float PI = (float) 3.14 ;
    private final float radius;


    public Circle(float radius) {
        this.radius = radius;
    }


    @Override
    public float areaFigure() {
        return   radius * radius  * PI;

    }



}
