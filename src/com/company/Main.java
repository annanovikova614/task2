package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
               
        System.out.print(calculateCountOfDaysInYear(readYear()));
    }
    public static int readYear()
    {
        System.out.print("Введите год:");
        return scanner.nextInt();
    }
    public static int calculateCountOfDaysInYear(int year)
    {
        return ((year % 4 != 0)||(year % 100 == 0 && year % 400 != 0)) ? 365 : 366;
    }
}
