package com.lesson6.Tasks;

import java.util.Scanner;

/**
 * 4. Написать программу, определяющую, является ли введённое
 *    целое число простым, т.е. делится без остатка только на 1 и само
 *    на себя.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(simpleNumber(number));
    }
    public static boolean simpleNumber (int number) {
        boolean result = true;
        for (int a = 2 ; a < number; a++) {
            if (number % a == 0) {
                return result = false;
            }
        }
        return result;
    }
}