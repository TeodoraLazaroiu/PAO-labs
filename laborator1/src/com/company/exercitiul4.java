package com.company;

import java.util.Scanner;

/*
Fiind dat un numar n, scrieti o metoda care insumeaza
toti multiplii de 3 si 5 pana la n (inclusiv).
 */

public class exercitiul4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 || i % 5 == 0) sum = sum + i;

        System.out.printf("Sum of numbers: %d", sum);
    }
}
