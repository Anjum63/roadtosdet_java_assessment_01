//8.Write a program to check balance and withdraw money from ATM booth using if else and switch case

package com.company;
import java.util.Scanner;

public class transaction_of_ATM {
    public static void main(String[] args) {
        double balance = 194140.35;

        Scanner input = new Scanner(System.in);
        System.out.println("To Check balance press 1 & To withdraw money press 2");
        int insert = input.nextInt();

        if (insert == 1)
            System.out.println("Your Balance is: " + balance);
        else if (insert == 2) {
            System.out.println("Please Enter Withdrawal Amount: ");
            float amount = input.nextFloat();
            System.out.println("Withdrawal successful!");
            System.out.println("Your Current Balance is: " + (balance - amount));
        } else
            System.out.println("Please Enter 1 or 2");

    }
}
