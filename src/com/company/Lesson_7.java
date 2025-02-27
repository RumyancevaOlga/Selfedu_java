package com.company;

public class Lesson_7 {
    // пример заполнения массива значениями функции
//        float y[] = new float[100];
//        float k = 0.5f, b = 2.0f;
//
//        for (int x = 0; x < 100; ++x) {
//            y[x] = k * x + b;
//        }
//
//        for (int x = 0; x < 100; ++x) {
//            System.out.print(y[x] + " ");
//        }

    // пример инициализации массива
//        int powers[] = {1, 2, 4, 6};
//
//        for (int x = 0; x < powers.length; ++x) {
//            System.out.print(powers[x] + " ");
//        }
//
//        System.out.println(powers[powers.length - 1]);
    //Двумерный массив, формирование единичной матрицы
//        final int N = 10;
//        int E[][] = new int[N][N];
//
//        for (int i = 0; i < N; ++i) {
//            for (int j = 0; j < N; ++j) {
//                if (i == j) E[i][j] = 1; else E[i][j] = 0;
//            }
//        }
//
//        for (int i = 0; i < N; ++i) {
//            for (int j = 0; j < N; ++j) {
//                System.out.print(E[i][j] + " ");
//            }
//            System.out.println();
//        }

    // пример зубчатого массива
//        short z[][] = new short[5][];
//        z[0] = new short[3];
//        z[1] = new short[4];
//        z[2] = new short[2];
//        z[3] = new short[3];
//        z[4] = new short[1];
//
//        short cnt = 1;
//        for (int i = 0; i < z.length; ++i) {
//            for (int j = 0; j < z[i].length; ++j) {
//                z[i][j] = cnt;
//                cnt++;
//            }
//        }
//
//        for (int i = 0; i < z.length; ++i) {
//            for (short val: z[i]) System.out.print(val + " ");
//            System.out.println();
//        }

    // удаление элемента массива по индексу
//        final int N = 9;
//        short a[] = new short[N];
//
//        for (int i = 0; i < N; ++i) a[i] = (short) (i + 1);
//
//        for (short val: a) System.out.print(val + " ");
//        System.out.println();
//
//        for (int i = 5; i < N - 1; ++i) {
//            a[i] = a[i + 1];
//        }
//
//        for (short val: a) System.out.print(val + " ");

    // вставка элемента массива по индексу
//        short a[] = new short[] {1, 2, 3, 5, 6, 7, 8, 9, 9};
//
//        for (short val : a) System.out.print(val + " ");
//        System.out.println();
//
//        for (int i = 8; i > 3 ; --i) {
//            a[i] = a[i - 1];
//        }
//
//        a[3] = 4;
//
//        for (short val : a) System.out.print(val + " ");

    // пузырьковая солртировка
//        byte a[] = {3, 5, 1, 6, 2, 4};
//
//        for (short val : a) System.out.print(val + " ");
//        System.out.println();
//
//        for (int i = 0; i < a.length - 1; ++i) {
//            byte min = a[i];
//            int pos = i;
//
//            for (int j = i + 1; j < a.length; ++j) {
//                if (min > a[j]) {
//                    pos = j;
//                    min = a[j];
//                }
//            }
//            byte t = a[i];
//            a[i] = a[pos];
//            a[pos] = t;
//        }
//        for (short val : a) System.out.print(val + " ");
}
