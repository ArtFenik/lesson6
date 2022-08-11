package com.lesson6.Tasks;

import java.util.Scanner;

/** Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
        Программа должна выводить:
        a. Количество дней
        b. Сумму осадков за этот период
        c. Среднее количество осадков за этот период
        d. Максимальное количество дневных осадков за этот период
        Не использовать массивы!
**/

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int day = scanner.nextInt();
        rainfallForThePeriod(day);
    }

    public static void rainfallForThePeriod(int day) {
        int result = 0;
        int maxValue = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= day; i++) {
            System.out.print("Введите количество осадков: ");
            int rainfall = scanner.nextInt();
            System.out.println("В " + i + " день выпало " + rainfall + " мм осадков");
            result += rainfall;
            System.out.println("Всего за прошедшее время выпало - " + result + " мм осадков");
            if (maxValue < rainfall) {
                maxValue = rainfall;
            }
            System.out.println("Максимальное количество осадков за " + day + " дней составило " + maxValue + " мм");
        }
        int averageRainfall = result/day;
        System.out.println("Среднее количество осадков за " + day + " дней составило - " + averageRainfall + " мм");
    }
}