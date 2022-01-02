//3.Write a program that takes a year from user and print whether that year is a leap year or not

package com.company;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args)
    {
        boolean a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = input.nextInt();

        a = (year % 4) == 0;
        b = (year % 100) != 0;
        c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
