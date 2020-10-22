package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year = readYear("год");
        int result = calculateCountOfDaysInYear(year);
        printCountOfDaysInYear(result);
    }

    private static int readYear(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s:", string);
        return scanner.nextInt();
    }

    private static void printCountOfDaysInYear(int result) {
        System.out.printf("Колличество дней в году %d", result);
    }

    public static int calculateCountOfDaysInYear(int year) {
        return ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) ? 365 : 366;
    }
}
