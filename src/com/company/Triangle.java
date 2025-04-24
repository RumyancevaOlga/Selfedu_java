package com.company;

public class Triangle {

    Point a;
    Point b;
    Point c;

    Triangle() {};

    Triangle(int xa, int ya, int xb, int yb, int xc, int yc) {
        this.a = new Point(xa, yb);
        this.b = new Point(xb, yb);
        this.c = new Point(xc, yc);
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.a = new Point(0, 0);
        triangle1.b = new Point(2, 0);
        triangle1.c = new Point(0, 2);

        System.out.println(triangle1.a.x + " " + triangle1.a.y + " " + triangle1.b.x + " " + triangle1.b.y + " "
                + triangle1.c.x + " " + triangle1.c.y);

        Triangle triangle2 = new Triangle(5, 5, 10, 5, 5, 10);

        System.out.println(triangle2.a.x + " " + triangle2.a.y + " " + triangle2.b.x + " " + triangle2.b.y + " "
                + triangle2.c.x + " " + triangle2.c.y);
    }
}
