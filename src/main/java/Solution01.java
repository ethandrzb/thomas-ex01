/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// Pseudocode Solution
// print "What is your name? "
// get name
// set output string to "Hello, " + name + ", nice to meet you!"
// print output

public class Solution01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = sc.nextLine();

        String greeting = greet(name);
        System.out.println(greeting);

        System.exit(0);
    }
    public static String greet(String name)
    {
        return "Hello, " + name + ", nice to meet you!";
    }
}
