//5.Write a program to calculate CGPA and find grade.

package com.company;
import java.util.Scanner;

public class cgpa_calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many semester you have completed?");
        int number = input.nextInt();

        int sumofcredits = 0;
        float CGPA = 0;
        float points = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter number of Courses for semester - " + i + ":");
            int c = input.nextInt();
            for (int j = 1; j <= c; j++) {
                System.out.print("Enter Course" + j + " total Credit: ");
                int credit = input.nextInt();
                sumofcredits = sumofcredits + credit;
                System.out.print("Enter Courser" + j + " Grade Point: ");
                float cgpa = input.nextFloat();
                points = points + (credit * cgpa);
            }
            CGPA = points / sumofcredits;
            System.out.format("Your Cgpa is : %.2f", CGPA);
            System.out.println("");

        }
    }
}