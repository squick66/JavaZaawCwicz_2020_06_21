package oop.Cwiczenie3KlasaAbstrakcyjna;

public class Runner {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3,5, "red");
        System.out.println(r1);

        Triangle t1 = new Triangle(2,3, "green");
        System.out.println(t1);

        Shape[] shapes = {r1, t1, new Triangle(3,4, "blue")};

        for (Shape  s: shapes) {
            System.out.println( s );
        }
    }
}
