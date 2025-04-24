package com.company;

public class Line {
    double x1, x2, y1, y2;

    public static void main(String[] args) {
        Line l1 = new Line();
        Line l2 = new Line();

        l1.x1 = 0;
        l1.x2 = 0;
        l1.y1 = 3;
        l1.y2 = 3;

        l2.x1 = 0;
        l2.x2 = 1;
        l2.y1 = 0;
        l2.y2 = 3;

        System.out.println("x1 = " + l1.x1 + ", x2 = " + l1.x2 + ", y1 = " + l1.y1 + ", y2 = " + l1.y2);
        System.out.println("x1 = " + l2.x1 + ", x2 = " + l2.x2 + ", y1 = " + l2.y1 + ", y2 = " + l2.y2);
    }
}
