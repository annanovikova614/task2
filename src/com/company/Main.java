package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year = readYear("год");
        writeCountDaysYear(year);
    }

    private static int readYear(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s: ", string);
        return scanner.nextInt();
    }

    private static void writeCountDaysYear(int year) {
        System.out.println("В году " + (isNonLeapYear(year) ? 365 : 366) + " дней");
    }

    private static boolean isNonLeapYear(int year) {
        return (year % 4 != 0) || (year % 100 == 0 && year % 400 != 0);
    }
}
