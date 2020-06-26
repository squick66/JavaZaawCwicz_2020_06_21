package oop.Cwiczenie2Kompozycja;

public class Line {

    private Point begin;
    private Point end;

    public Line (int x1, int y1, int x2, int y2){
    this.begin = new Point(x1, y1);
    this.end = new Point(x2, y2);
    }

    public Line(Point begin, Point end){
    this.begin = begin;
    this.end = end;
    }

    public Point getBegin(){
        return begin;
    }

    public Point getEnd(){
        return end;
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public int getBeginX(){ //zwraca współrzędną x z Point begin
        return this.begin.getX();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public int getBeginY(){
        return this.begin.getY();
    }

    public int[] getBeginXY(){ // tablica współrzędnych punktu początkowego
     return this.begin.getXY();
    }

    public int[] getEndXY(){
        return this.end.getXY();
    }

    @Override
    public String toString() {
        return String.format("Odcinek: [początek = %s, koniec = %s]}",
                this.begin, //przekazanie obiektu do sout powoduje wywołanie jego metody to String
                this.end);
    }

    public double getLength(){
        return this.begin.distance(this.end);
    }
    /*@Override
    public String toString() {
        return "Line{" +
                "begin=" + begin.getXY() +
                ", end=" + end.getXY() +
                '}';*/
    }

