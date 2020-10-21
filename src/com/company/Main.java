package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        printCountOfDaysInYear();
    }

    public static int readYear()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        return year;
    }

    public static void printCountOfDaysInYear()
    {
        int year = readYear();
        int countOfDaysInYear = calculateCountOfDaysInYear(year);
       System.out.print("Количество дней = %d", countOfDaysInYear);
    }

    public static int calculateCountOfDaysInYear(int year)
    {
        int countOfDaysInYear = ((year % 4 != 0)||(year % 100 == 0 && year % 400 != 0)) ? 365 : 366;
        return countOfDaysInYear;
    }
}
