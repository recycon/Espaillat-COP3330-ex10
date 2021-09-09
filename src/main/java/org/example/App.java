package org.example;
import java.util.Scanner;
/**
 *Enter the price of item 1: 25
 * Enter the quantinty 2
 * Enter the price of item 2: 10
 * Enter the quantity of item 2: 1
 * Enter the price of item 3: 4
 * Enter the quantity of item 3: 1
 * Subtotal: $64.00
 * Tax: $3.52
 * Total: $67.52
 *
 * tax is 5.5%
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);

        System.out.print( "Enter the price of item 1: " );
        double oneP=in.nextDouble();
        System.out.print( "Enter the quantity of item 1: " );
        double oneQ= in.nextDouble();
        System.out.print( "Enter the price of item 2: " );
       double twoP= in.nextDouble();
        System.out.print( "Enter the quantity of item 2: " );
       double twoQ= in.nextDouble();
        System.out.print( "Enter the price of item 3: " );
        double threeP= in.nextDouble();
        System.out.print( "Enter the quantity of item 3: " );
        double threeQ= in.nextDouble();
        double subTotal=oneQ*oneP+twoQ*twoP+threeQ*threeP;
        System.out.print( "Subtotal: $");
        System.out.format("%.2f\n",subTotal);
        double tax=0.055*subTotal;
        System.out.print( "Tax: $");
        System.out.format("%.2f\n",tax);
        double total=tax+subTotal;
        System.out.print( "Total: $");
        System.out.format("%.2f\n",total);

    }
}
