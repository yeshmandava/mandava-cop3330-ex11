package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging: ");
        double euros = input.nextDouble();
        System.out.print("What is the current exchange rate of the euro: ");
        double ExcRate = input.nextDouble();

        double convert = ((euros * ExcRate)/100);
        System.out.printf("%.2f euros at an exchange rate of %.2f is\n%.2f U.S. dollars.", euros, ExcRate, convert);

    }
}
