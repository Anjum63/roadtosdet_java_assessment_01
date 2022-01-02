//7.Write a program to sum of random numbers

package com.company;
import java.util.Scanner;

public class sum_of_numbers {

    public static void main(String[] args) {

        System.out.print("How many number you want to sum?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum=0;
        for(int i=1; i<=number; i++)
        {
            System.out.print("Enter value "+i+": ");
            int num = input.nextInt();
            sum = sum + num ;
        }

        System.out.println("The sum is " + sum);
    }
}
