package com.company;

public class Rect {
    int xUpperLeft;
    int yUpperLeft;
    int xLowerRight;
    int yLowerRight;

    Rect() {};

    Rect(int xUpperLeft, int yUpperLeft, int xLowerRight, int yLowerRight) {
        this.xUpperLeft = xUpperLeft;
        this.yUpperLeft = yUpperLeft;
        this.xLowerRight = xLowerRight;
        this.yLowerRight = yLowerRight;
    }

    Rect(int xUpperLeft, int yUpperLeft, double width, double height) {
        this.xUpperLeft = xUpperLeft;
        this.yUpperLeft = yUpperLeft;
        this.xLowerRight = (int) (xUpperLeft + width);
        this.yLowerRight = (int) (yUpperLeft + height);
    }

    public static void main(String[] args) {

        Rect rect1 = new Rect();
        rect1.xUpperLeft = 1;
        rect1.yUpperLeft = 1;
        rect1.xLowerRight = 2;
        rect1.yLowerRight = 2;

        System.out.println(rect1.xUpperLeft + " " + rect1.yUpperLeft + " " + rect1.xLowerRight + " " + rect1.yLowerRight);

        Rect rect2 = new Rect(3, 3, 4, 4);

        System.out.println(rect2.xUpperLeft + " " + rect2.yUpperLeft + " " + rect2.xLowerRight + " " + rect2.yLowerRight);

        Rect rect3 = new Rect(0, 0, 5.0, 5.0);

        System.out.println(rect3.xUpperLeft + " " + rect3.yUpperLeft + " " + rect3.xLowerRight + " " + rect3.yLowerRight);
    }
}
