package com.company;

import java.util.Scanner;

public class Menu
{
    // singleton class for an interactive menu

    private static Menu menu = null;

    // private constructor
    private Menu() { }

    public static void showMenu()
    {
        System.out.println("-----------------------------------");
        System.out.println("Choose the exercise you wish to run");
        System.out.println("1: Exercise 1");
        System.out.println("2: Exercise 2");
        System.out.println("3: Exercise 3");
        System.out.println("-----------------------------------");

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int option = reader.nextInt();

        while (option != 0)
        {
            switch(option)
            {
                case 0:
                {
                    break;
                }
                case 1: {
                    Person p1 = new Person();
                    Person p2 = new Person("ana", "ionescu", 40, 1013102094);

                    System.out.println(p1.getName());
                    System.out.println(p2.getName());

                    System.out.println("-----------------------------------");
                    break;
                }
                case 2: {
                    Room r1 = new Room();
                    Room r2 = new Room(30, "class", 2);

                    System.out.println(r1.getFloor());
                    System.out.println(r2.getFloor());

                    System.out.println("-----------------------------------");
                    break;
                }
                case 3: {
                    Person p2 = new Person("ana", "ionescu", 40, 1013102094);
                    Room r2 = new Room(30, "class", 2);
                    Subject s = new Subject(r2, 20, p2);

                    System.out.println(s.getRoom());
                    System.out.println(s.getTeacher());

                    System.out.println("-----------------------------------");
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                    break;
                }
            }

            option = reader.nextInt();
        }
        reader.close();
    }

    public static Menu getInstance()
    {
        if (menu == null) menu = new Menu();

        return menu;
    }
}
