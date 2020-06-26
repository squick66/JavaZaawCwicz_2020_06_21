package oop.Point2D;

public class Runner {
    public static void main(String[] args) {

        Point2D P1 = new Point2D();
        Point2D P2 = new Point2D(2,0);
        Point2D P3 = new Point2D(3,0);

        System.out.println("Odległość P1 względem środka układu wsp.: " + P1.distance());
        System.out.println("Odległość P2 względem środka układu wsp.: " + P2.distance());
        System.out.println("Odległość P2 od P3: " + P1.distance(P2));
        System.out.println("Odległość P1 od (5,10): " + P1.distance(5,10));
    }
}
