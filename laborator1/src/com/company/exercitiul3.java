package com.company;

import java.util.Scanner;

/*
Scrieți o metoda care sa calculeze factorialul
unui numar n citit de la tastatura.
 */

public class exercitiul3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact =  fact * i;

        System.out.printf("Factorial: %d", fact);
    }
}
