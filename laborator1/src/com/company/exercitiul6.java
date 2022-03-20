package com.company;

import java.util.Scanner;

/*
Cititi de la tastatura n note, numere intregi, intr-un vector.
Cand cititi valoarea -1 de la tastatura, citirea notelor
se opreste si programul afiseaza media acestora.
 */

public class exercitiul6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];
        int i = 0;

        System.out.print("Enter values: ");
        while(true)
        {
            int input = scan.nextInt();
            if (input != -1) arr[i++] = input;
            else break;
        }
        int n = i;

        int mean = 0;
        for (i = 0; i < n; i ++)
        {
            mean = mean + arr[i];
        }

        float meanf = (float)mean / n;
        System.out.printf("Mean value: %f", meanf);
    }
}
