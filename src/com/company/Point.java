package com.company;

public class Point {
    int x, y;

    public static void main(String[] args) {
        Point pt = new Point();
        pt = new Point(); // создается новая ссылка, предыдущий объект удаляется сборщиком мусора
        pt.x = 1;
        pt.y = 2;

        System.out.println("x = " + pt.x + ", y = " + pt.y);

        Point pt2 = new Point();
        pt2.x = 10;
        pt2.y = 20;

        System.out.println("x = " + pt2.x + ", y = " + pt2.y);
    }
}


