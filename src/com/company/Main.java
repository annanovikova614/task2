package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year = readYear("год");
        boolean countDaysYear = calcCountDaysYear(year);
        int result = chooseLeapYearOrNonLeapYear(countDaysYear);
        writeCountDaysYear(result);
    }

    private static int readYear(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s: ", string);
        return scanner.nextInt();
    }

    private static void writeCountDaysYear(int result) {
        System.out.printf("В году %d дней", result);
    }

    private static int chooseLeapYearOrNonLeapYear(boolean countDaysYear) {
        return  countDaysYear ? 365 : 366;
    }

    private static boolean calcCountDaysYear(int year) {
        return (year % 4 != 0) || (year % 100 == 0 && year % 400 != 0);
    }
}
