package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год:");
        int year = scanner.nextInt();
        double intercalaryOrCommon = intercalaryOrCommon(year);
        System.out.print(intercalaryOrCommon(year));
    }
        public static int intercalaryOrCommon(int year)
        {
            if ((year % 4 != 0)||(year % 100 ==0 && year % 400 !=0))
            {
                return 365;
            }
            else
            {
                return 366;
            }

        }


}
