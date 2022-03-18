package com.javarush.task.pro.task02.task0214;

import java.util.Locale;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
Scanner console = new Scanner(System.in);
String oneStr = console.nextLine();
String twoStr = console.nextLine();
String threeStr = console.nextLine();

String oneStrAdd = oneStr.toLowerCase();
String twoStrAdd = twoStr.toUpperCase();

System.out.println(threeStr);
System.out.println(twoStrAdd);
System.out.println(oneStrAdd);



    }
}
