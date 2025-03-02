package com.company;

public class Lesson_8_1 {

    //примеры объявления строк
//        String str1 = "Java";
//        String str2 = new String();
//        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println();
//
//        str1 = str3;
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);

    //методы строк
//        String str1 = "Java";
//        String str2 = "Hello World!";
//
//        System.out.println(str1.length());
//
//        char[] helloArray = str2.toCharArray();
//        System.out.println(helloArray.getClass());

//        String s = null;
//        if (s == null || s.length() == 0) System.out.println("String is empty");
//        if(s ==  null || s.isEmpty()) System.out.println("String is empty");

//        String str1 = "Java";
//        String str2 = "Hello";
//        String str3 = str2 + ", " + str1;
//        String str4 = "Год " + 2025;
//        String str5 = String.join(" ", str2, str1);
//
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);

//        String str = "Java";
//        char c = str.charAt(2);
//
//        System.out.println(c);

//        String str = "Hello world!";
//        int start = 6;
//        int end = 11;
//        char[] dst = new  char[end - start];
//        str.getChars(start, end, dst, 0);
//
//        System.out.println(dst);

//        String str1 = "Hello";
//        String str2 = "hello";
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));

//        String str1 = "hello";
//        String str2 = "world";
//        String str3 = "hell";
//
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareTo(str3));
//        System.out.println(str1.compareTo(str1));

//        String str1 = "Hello world";
//        String str2 = "I work";
//        boolean result = str1.regionMatches(6, str2, 2, 3);
//
//        System.out.println(result);

//        String str = "Hello world";
//        int index1 = str.indexOf('l');
//        int index2 = str.indexOf("wo");
//        int index3 = str.lastIndexOf('l');
//
//        System.out.println(index1 + " " + index2 + " " + index3);

//        String str = "myfile.exe";
//        boolean start = str.startsWith("my");
//        boolean end = str.endsWith("ex");
//
//        System.out.println(start + " " + end);

//        String str = "Hello world";
//        String replStr1 = str.replace('l', 'd');
//        String replStr2 = str.replace("Hello", "Bye");
//
//        System.out.println(replStr1);
//        System.out.println(replStr2);

//        String str = " hello world  ";
//        System.out.println(str);
//
//        str = str.trim();
//        System.out.println(str);

//        String str = "Hello world";
//        String substr1 = str.substring(6);
//        String substr2 = str.substring(3, 5);
//
//        System.out.println(substr1);
//        System.out.println(substr2);

//        String str = "Hello World";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

//        String text = "Я люблю язык Java!";
//        String[] words = text.split(" ");
//
//        for (String word : words) System.out.println(word);

}
