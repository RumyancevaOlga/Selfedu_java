package com.company;

public class Lesson_5 {
    //    //нахождение модуля числа
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//
//        if(x < 0) x = x * -1;
//
//        System.out.println(x);
//        in.close();

//        //проверка числа на отрицательность
//        float x;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        x = in.nextFloat();
//
//        if (x < 0) System.out.println("Введенное число " + x + " является отрицательным.");
//        //if (x >= 0) System.out.println("Введенное число " + x + " является неотрицательным.");
//        //else System.out.println("Введенное число " + x + " является неотрицательным.");
//        else if (x > 0) System.out.println("Введенное число " + x + " является положительным.");
//        else System.out.println("Введенное число равно 0.");
//
//        in.close();

//        //нахождение площади треугольника или прямоугольника
//        short item = -1;
//        Scanner in = new Scanner(System.in);
//        System.out.print("1 - площадь треугольника \n2 - площадь прямоугольника\n");
//        item = in.nextShort();
//
//        double h, a, S = 0;
//        if (item == 1) {
//            System.out.print("Введите высоту и основание треугольника: ");
//            h = in.nextDouble();
//            a = in.nextDouble();
//            S = 0.5 * h * a;
//        }
//        else if (item == 2) {
//            System.out.print("Введите стороны прямоугольника: ");
//            h = in.nextDouble();
//            a = in.nextDouble();
//            S = h * a;
//        }
//
//        System.out.println("Площадь равна: " + S);
//        in.close()

    //проверка на вхождение числа в отрезок
//        double a;
//        Scanner in = new Scanner(System.in);
//        a  = in.nextDouble();
//
//        if (a >= -2 && a <= 5)
//            System.out.println("a принадлежит [-2; 5]");
//
//        in.close();
//        double a;
//        Scanner in = new Scanner(System.in);
//        a  = in.nextDouble();
//
//        if (a < -2 || a > 5)
//            System.out.println("a не принадлежит [-2; 5]");
//
//        in.close();
//        double a;
//        Scanner in = new Scanner(System.in);
//        a  = in.nextDouble();
//
//        if (!(a < -2 || a > 5))
//            System.out.println("a принадлежит [-2; 5]");
//
//        in.close();

    //пример составных условий
//        int x = -1, y = 5;
//        if ((x < 0 || x > 2) &&  y >= 5 && y <= 7)
//            System.out.println("x не принадлежит [0; 2], y принадлежит [5; 7]");

//        //оператор switch
//        short item;
//        System.out.print("0 - выход из программы \n1 - площадь треугольника \n2 - площадь прямоугольника\n3 - площадь круга\n4 - площадь трапеции \n");
//        Scanner in = new Scanner(System.in);
//        item = in.nextShort();
//
//        switch (item) {
//            case 0: break;
//            case 1: System.out.println("выбрана площадь треугольника"); break;
//            case 2: System.out.println("выбрана площадь прямоугольника"); break;
//            case 3: System.out.println("выбрана площадь круга"); break;
//            case 4: System.out.println("выбрана площадь трапеции"); break;
//            default: System.out.println("не выбран ни один из пунктов меню");
//
//        }
//
//        in.close();
}
