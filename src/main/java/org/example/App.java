/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or 2 if you are female: ");
        int n1 = sc.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        Double n2 = sc.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        Double n3 = sc.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        Double n4 = sc.nextDouble();
        Double n5;
        if (n1 == 1)
        {
            n5 = (n2 * 5.14 / n3 * .73) - .015 * n4;
            System.out.printf("\nYour BAC is %f\n", n5);
            if (n5 > .08)
                System.out.print("It is not legal for you to drive");
            else
                System.out.print("It is legal for you to drive");
        }
        else if (n1 == 2)
        {
            n5 = (n2 * 5.14 / n3 * .66) - .015 * n4;
            System.out.printf("\nYour BAC is %f\n", n5);
            if (n5 > .08)
                System.out.print("It is not legal for you to drive");
            else
                System.out.print("It is legal for you to drive");
        }
    }
}
