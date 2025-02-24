package com.company;

public class Lesson_6 {
    // цикл while
//        double S = 0;
//        int n = 1;
//
//
//        while (n <= 1000) {
//            S += 1.0 / n;
//            n++;
//        }
//
//        Scanner in = new Scanner(System.in);
//
//        while (S < 100 && n != 0) {
//            System.out.println("Введите целое число");
//            n = in.nextInt();
//
//            S += n;
//        }
//
//        System.out.println(S);
//        in.close();

//        int S = 0;
//        int i = 1;
//
//        while ((S += ++i) < 50);
//
//        System.out.println(S);

    //цикл for

//        double S = 0;
//
//        for (int n = 1; n<= 1000; ++n) S+= 1.0 / n;
//
//        System.out.println(S);

//

    //цикл do while

//        final int secret_code = 13;
//        int code_ent;
//
//        Scanner in = new Scanner(System.in);
//
//        do{
//            System.out.print("Введите секретный код: ");
//            code_ent = in.nextInt();
//        } while (code_ent != secret_code);
//
//        System.out.println("Вы ввели верный код!");
//        in.close();

    //вложенные циклы

//        int N = 7, M = 7, S = 0;
//
//        for (int i = 0; i < N; ++i) {
//            for (int j = 0; j < M; ++j) {
//                S += i * j;
//            }
//        }
//
//        System.out.println(S);

    //оператор continue

//        float x, S = 0;
//        int n = 0;
//
//        Scanner in = new Scanner(System.in);
//
//        do {
//            System.out.print("Введите число: ");
//            x = in.nextFloat();
//
//            if (x < 0) continue;
//
//            n++;
//            S += x;
//            System.out.println("Текущая сумма: " + S);
//        } while (n < 5);
}
