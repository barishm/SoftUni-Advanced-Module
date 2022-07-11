package oop.t1_WorkingWithAbstraction.PointInRectangle;

public class Rectangle {
    private Point A;
    private Point C;

    public Rectangle(Point a, Point c) {
        A = a;
        C = c;
    }
    public boolean contains(Point x){
        return x.greaterOrEqual(A)&& x.lessOrEqual(C);
    }

}
