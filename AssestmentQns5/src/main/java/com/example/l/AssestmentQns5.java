package com.example.l;

import java.util.Scanner;

public class AssestmentQns5 {
    public static int computeProduct(int input1, int input2){
        // declear intial value to 0 aka false
        int Product = 0;
        if (((input1>=10)&&(input1<=50))&& ((input2<=50)&&(input2>=10)))
        // to test for positive values
        {
            Product = input1 * input2;
        }

        return Product;
    }// return values if else statement activates

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = keyboard.nextInt();
        System.out.println("Enter Second Number :");
        int b = keyboard.nextInt();
        if (computeProduct(a , b)> 0)
        {
            System.out.println("The product of "+ a + " and " + b + " are " + computeProduct(a , b) );
        } else
        {
            System.out.println("You are not in range!");
        }

    }
}
