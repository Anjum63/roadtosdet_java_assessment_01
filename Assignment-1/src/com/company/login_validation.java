//6.Write a program to check if the provided user credentials are valid during login

package com.company;
import java.util.Scanner;

public class login_validation {
        public static void main(String[] args) {
            String Name = "anjumanlayla63@gmail.com";
            String Password = "Anjum@1212";

            Scanner input = new Scanner(System.in);

            System.out.print("Username: ");
            String nameinput = input.next();

            System.out.print("Password: ");
            String passwordinput = input.next();

            System.out.println(nameinput.equals(Name) && passwordinput.equals(Password) ? "Login Successful!" : "Login Failed!");
        }
    }

