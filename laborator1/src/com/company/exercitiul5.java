package com.company;

import java.util.Scanner;

/*
Cititi de la tastatura n numere. Elementele citite vor fi organizate
in doi arri diferiti, in functie de paritate (de ex: elementele
pare in arrul x, iar cele impare in arrul y).
 */

public class exercitiul5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.print("Elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        int[] odd = new int[n], even = new int[n];
        int noEven = 0, noOdd = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0) even[noEven++] = arr[i];
            else odd[noOdd++] = arr[i];
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < noEven; i ++)
        {
            System.out.printf("%d ", even[i]);
        }

        System.out.println("");

        System.out.print("Odd numbers: ");
        for (int i = 0; i < noOdd; i ++)
        {
            System.out.printf("%d ", odd[i]);
        }
    }
}
