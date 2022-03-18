package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
Scanner cnsUsers = new Scanner(System.in);
int oneStr = cnsUsers.nextInt();
int twoStr = cnsUsers.nextInt();
int threeStr = cnsUsers.nextInt();
int sa = (oneStr + twoStr + threeStr)/3;
        System.out.println(sa);

    }
}
