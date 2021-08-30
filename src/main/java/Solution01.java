/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

public class Solution01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = sc.nextLine();

        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);

        System.exit(0);
    }
}
