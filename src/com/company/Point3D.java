package com.company;

public class Point3D {
    double x, y, z;

    public static void main(String[] args) {
        Point3D pt1 = new Point3D();
        Point3D pt2 = new Point3D();
        Point3D pt3 = new Point3D();

        pt1.x = 1;
        pt1.y = 2;
        pt1.z = 3;

        pt2.x = 10;
        pt2.y = 20;
        pt2.z = 30;

        pt3.x = 4;
        pt3.y = 5;
        pt3.z = 6;

        System.out.println("x = " + pt1.x + ", y = " + pt1.y + ", z = " + pt1.z);
        System.out.println("x = " + pt2.x + ", y = " + pt2.y + ", z = " + pt2.z);
        System.out.println("x = " + pt3.x + ", y = " + pt3.y + ", z = " + pt3.z);
    }
}
