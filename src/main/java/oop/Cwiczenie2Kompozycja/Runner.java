package oop.Cwiczenie2Kompozycja;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Point P1 = new Point(2,2);
        Point P2 = new Point(4, 2);

        Line line1 = new Line(P1, P2);
        System.out.println("Długość odcinka P1, P2: " + P1.distance(P2) + ". Jego parametry: " + line1);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 4, 5, 4);
        System.out.println("Długość ocinka linia2: " + line2.getLength() + ". Jego parametry to: " + line2);

    }
}
