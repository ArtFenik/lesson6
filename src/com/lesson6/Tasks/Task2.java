package com.lesson6.Tasks;

import java.util.Scanner;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(sumOfNumbers(number));
        System.out.println(sumOfNumbersFor(number));
    }
    public static int sumOfNumbers(int number) {
        int sum = 0;
        int numberWhile = number;
        while (numberWhile != 0) {
            sum = sum + numberWhile%10;
            numberWhile = numberWhile / 10;
        }
        return sum;
    }
    public static int sumOfNumbersFor(int number) {
        int sum = 0;
        for(int numberFor = number; numberFor != 0; numberFor/=10) {
            sum = sum + numberFor%10;
        }
        return sum;
    }
}
