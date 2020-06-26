package oop.Cwiczenie3KlasaAbstrakcyjna;

public class Triangle extends Shape{

    private int a;
    private int h;

    public Triangle(int a, int h, String color){
        this.a = a;
        this.h = h;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (a * h )/2;
    }
}
