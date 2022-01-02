//2.Take three numbers from the user and print the greatest number

package com.company;
import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:");
        a = input.nextInt();
        System.out.print("Enter Second Number:");
        b = input.nextInt();
        System.out.print("Enter Third Number:");
        c = input.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Largest Number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Largest Number is:"+b);
        }
        else
        {
            System.out.println("Largest Number is:"+c);
        }

    }

}
