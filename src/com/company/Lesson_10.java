package com.company;

public class Lesson_10 {

    public static void main(String[] args) {
//        int w = 5;
//        float h = 3.4f;
//
//        float P1 = perimetr(w, h);
//        float P2 = perimetr(5, 4);
//
//        System.out.println(P1);
//        System.out.println(P2);

//        byte array[] = {1, 3, 0, -2, 7, 9};
//        show_ar(array);
//        System.out.println();
//        shoe_array(1, 3, 0, -2, 7, 9);

//        int a1 = module(-3); // 1-й
//        int a2 = (int) module(-3.5); // 2-й
//        double a3 = module(-3); // 1-й
//        double a4 = module(-3.5); // 2-й
//
//        System.out.print(a1 + "\n" + a2 + "\n" + a3 + "\n" + a4);

        up_and_down(1);
    }
    // вычисление периметра прямоугольника
    static float perimetr(float a, float b) {
        float res = 2 * (a + b);
        return res;
    }

    static void show_ar(byte[] ar) {
        for (byte val : ar)
            System.out.print(val + " ");
    }

    // передача произвольного количества аргументов в метод
    static void shoe_array(int ...ar) {
        for (int val : ar)
            System.out.print(val + " ");
    }

    // перегрузка методов
    static int module(int x) {
        if (x < 0) x = -x;
        return x;
    }

    static double module(double x) {
        return (x < 0) ? -x : x; // та же запись с тернарным оператором
    }

    // рекурсивный метод
    static void up_and_down(int n) {
        System.out.println("Уровень вниз " + n);
        if (n < 4) up_and_down(n + 1);
        System.out.println("Уровень вверх " + n);
    }
}
