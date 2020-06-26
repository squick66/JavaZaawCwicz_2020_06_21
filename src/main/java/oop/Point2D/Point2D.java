package oop.Point2D;

public class Point2D {
    private int x;
    private int y;

    public Point2D() {

    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public void setXY(int x, int y) {
        setX(x);
    }

    public int[] getXY() {
        int[] pos = {x, y};
        return pos;
    }

    //odległość od this do (x,y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    //pa, pb
    //Match.sqrt((pb.x -pa.x)^2 + (pb.y - pa.x)^2)
    //Match.pow(a,b) = a^b
    //odległość od this do point
    //x= this.x, y = this.y => stanowią punkt na którym wykonywana jest metoda np. P1.distance(); (P1 = x , y)
    //point.x i point.y => stanowią punkt wpisywany do metody (argumenty do metody) np. P1.distance(point);
    public double distance(Point2D point) {
        return distance(point.x, point.y);
        //return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }


    //odległość od this to (0,0)
    public double distance() {
        return distance(0,0);
        //return Math.sqrt(Math.pow(this.x , 2) + Math.pow(this.y, 2));
    }
}
