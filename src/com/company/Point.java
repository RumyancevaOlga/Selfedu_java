package com.company;

public class Point {
    int x, y;
    int color;


    // инициализатор полей класса
    {
        x = -1;
        y = -1;
        color = 0;
    }

    Point() { // при добавлении нового конструктора с аргументами, конструктор по умолчанию работать не будет
//        x = -1;
//        y = -1;
//        color = 0;
    }

    Point(int x, int y) {
//        this(); // вызываем конструктор без аргументов
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point pt = new Point();
        pt = new Point(); // создается новая ссылка, предыдущий объект удаляется сборщиком мусора

        System.out.println("x = " + pt.x + ", y = " + pt.y + ", color = " + pt.color);

        pt.x = 1;
        pt.y = 2;

        System.out.println("x = " + pt.x + ", y = " + pt.y+ ", color = " + pt.color);

        Point pt2 = new Point();
        pt2.x = 10;
        pt2.y = 20;

        System.out.println("x = " + pt2.x + ", y = " + pt2.y+ ", color = " + pt2.color);

        Point pt3 = new Point(3, 4);

        System.out.println("x = " + pt3.x + ", y = " + pt3.y+ ", color = " + pt3.color);
    }
}


