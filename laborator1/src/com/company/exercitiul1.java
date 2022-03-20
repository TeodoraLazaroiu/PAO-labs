package com.company;

import java.util.Scanner;

/*
Scrieti un program care sa afișeze toate numerele pare din
intervalul [0,n], unde n este un numar citit de la tastatura.
 */

public class exercitiul1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();

        for (int i = 0; i  <= n; i =  i + 2)
        {
            System.out.println(i);
        }
    }
}
