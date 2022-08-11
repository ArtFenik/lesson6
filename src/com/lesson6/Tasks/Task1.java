package com.lesson6.Tasks;

import java.util.Scanner;

/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value1 = scanner.nextInt();
//        value1 = factorial(value1);
        value1 = factorialWhile(value1);
        System.out.println("Факториал числа равен - " + value1);
    }

    public static int factorial(int value1) {
        for(int value2 = (value1-1); value2 > 0; value2--) {
            value1 = value1 * value2;
        }
        return value1;
    }

    public static int factorialWhile(int value1){
        int result = 1;
        int i = 1;
        while (i <= value1) {
            result = i * result;
            i++;
        }
        return result;
    }
}
