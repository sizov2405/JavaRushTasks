package task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
    if (x>0 && y>0)
    { 
        System.out.println("1"); }
    if (x<0 && y>0)
    {
        System.out.println("2");
    }
    if (x<0 && y<0)
    {
        System.out.println("3");
    }
    if (x>0 && y<0)
    {
        System.out.println("4");
    }
    }
}
