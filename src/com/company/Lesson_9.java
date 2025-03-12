package com.company;

public class Lesson_9 {
    // примеры использований инверсии (НЕ)
//        int var = 121; // двоичный вид: 00000000 00000000 00000000 01111001
//        int not_v = ~var; // двоичный вид: 11111111 11111111 11111111 10000110 (число -122)
//
//        System.out.println(not_v);

    // пример использования И
//        byte flags = 5; // двоичный вид: 00000101
//        byte mask = 4; // 00000100
//
//        int res = flags & mask;
//
//        System.out.println(res); //00000100 (4)
//
//        if ((flags & mask) == mask) System.out.println("Включен 2-й бит числа");
//        else System.out.println("2-й бит числа выключен");

//        byte flags = 13; // двоичный вид: 00001101
//        byte mask = 5; // 00000101
//
//        // flags = (byte) (flags & ~mask); // 00001000 (8)
//        // краткая запись
//        flags &= ~mask;
//        System.out.println(flags);

    // пример использования ИЛИ
//        byte flags = 8; // двоичный вид: 00001000
//        byte mask = 5; // 00000101
//
//        flags = (byte) (flags | mask); // 00001101 (13)
//
//        System.out.println(flags);

    // пример использования XOR (исключающее ИЛИ)
//        byte flags = 9; // двоичный вид: 00001001
//        byte mask = 1; // 00000001
//
//        flags = (byte) (flags ^ mask); // 00001000 (8)
//        System.out.println(flags);
//
//        flags ^= mask; // 00001001 (9)
//        System.out.println(flags);

    // пример шифрования данных при помощи XOR
//        String msg = "Привет мир!";
//        byte key = 111;
//
//        System.out.println(msg);
//
//        char[] str = msg.toCharArray();
//        for (int i = 0; i < msg.length(); ++i) str[i] ^= key;
//
//        msg = new String((str));
//        System.out.println(msg);
//
//        for (int i = 0; i < msg.length(); ++i) str[i] ^= key;
//
//        msg = new String(str);
//        System.out.println(msg);

    // смещение бит вправо и влево
//        int x = 160; // 10100000
//        System.out.println(x);
//        x = x >> 1; // 01010000 (80)
//        System.out.println(x);
//        x = x >> 1; // 00101000 (40)
//        System.out.println(x);
//        x = x >> 1; // 00010100 (20)
//        System.out.println(x);
//        x = x >> 1; // 00001010 (10)
//        System.out.println(x);
//        x = x >> 1; // 00000101 (5)
//        System.out.println(x);
//        x = x >> 1; // 00000010 (2)
//        System.out.println(x);
//        x = x >> 1; // 00000001 (1)
//        System.out.println(x);

//        byte x = 5; // 00000101
//        System.out.println(x);
//        x = (byte) (x << 1); // 00001010 (10)
//        System.out.println(x);
}
