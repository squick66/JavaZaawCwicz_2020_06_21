package oop.Cwiczenie3KlasaAbstrakcyjna;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
