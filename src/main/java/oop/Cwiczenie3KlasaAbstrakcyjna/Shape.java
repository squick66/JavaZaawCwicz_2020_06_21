package oop.Cwiczenie3KlasaAbstrakcyjna;

public abstract class Shape {

    protected String color;

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Nazwa kształtu: %s\nKolor: %s\nPowierzchnia: %s\n",
               getClass().getSimpleName() //pobiera nazwę klasy
                , color, getArea());
    }
}
