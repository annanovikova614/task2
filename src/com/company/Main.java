package com.company; 
 
import java.util.Scanner; 
 
public class Main { 

    public static void main(String[] args) { 
        int year = readYear("год"); 
        int result = calculateCountOfDaysInYear(year); 
        printCountOfDaysInYear(result); 
        writeLeapOrNonLeapYear(result); 
    } 
 
    private static int readYear(String string) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.printf("Введите %s: ", string); 
        return scanner.nextInt(); 
    } 

    private static void printCountOfDaysInYear(int result) { 
        System.out.printf("Количество дней в году %d\n", result); 
    } 

    private static void writeLeapOrNonLeapYear(int result) {
        System.out.println("Год " + ((result == 365) ? "не" : "") + "високосный");
    } 

    private static int calculateCountOfDaysInYear(int year) { 
        return ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) ? 365 : 366; 
    } 
}

