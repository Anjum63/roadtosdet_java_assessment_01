//4.Write a program to check if inputted letter is small or capital

package com.company;
import java.util.Scanner;

public class smaller_or_capital {
    public static void main(String args[]){

        char alpha;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a character: ");
        alpha=scan.next().charAt(0);

        if(alpha>='A' && alpha<='Z'){
            System.out.println(alpha+" is Smaller Alphabet ");
        }
        else if(alpha>='a' && alpha<='z'){
            System.out.println(alpha+" is Capital Alphabet ");
        }
        else{
            System.out.println(alpha+" is not a Alphabets ");
        }
    }
}
