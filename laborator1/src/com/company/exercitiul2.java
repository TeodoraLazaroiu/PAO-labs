package com.company;

import java.util.Scanner;

/*
Scrieți un program care sa compare doua numere a și b
citite de la tastatura si sa afiseze numarul mai mare.
 */

public class exercitiul2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) System.out.println(a);
        else System.out.println(b);
    }
}
