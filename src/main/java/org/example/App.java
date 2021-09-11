/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //asking about car problems (user answers by saying "y" or "n")
        System.out.print("Is the car silent when you turn the key? ");
        String silent = scanner.next();

        //a type of artificial intelligence program if statement that follows a set of rules
        //"y" goes to the next question "n" (or else) gives solution
        if (silent.equals("y") || silent.equals("yes")) {

            System.out.print("Are the battery terminals corroded? ");
            String corroded = scanner.next();

            if (corroded.equals("y") || corroded.equals("yes"))

                System.out.println("Clean terminals and try starting again.");
            else

                System.out.println("Replace cables and try again");
        }
            else {

            System.out.print("Does the car make a slicking noise? ");
            String slicking = scanner.next();

            if (slicking.equals("y") || slicking.equals("yes"))
                System.out.println("Replace the battery.");
            else {

                System.out.print("Does the car crank up but fail to start? ");
                String crank = scanner.next();

                if (crank.equals("y") || crank.equals("yes"))
                    System.out.println("Check spark plug connection.");
                else {

                    System.out.print("Does the engine start and then die? ");

                    String die = scanner.next();

                    if (die.equals("y") || die.equals("yes")) {
                        System.out.println("Does your car have fuel injection? ");

                        String fuel = scanner.next();

                        if (fuel.equals("y") || fuel.equals("yes"))
                            System.out.println("Get in it for service.");
                        else

                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                     else {

                        System.out.println("This should not be possible.");

                    }
                }
            }
        }
    }
}