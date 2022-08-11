package com.lesson6.Tasks;

/**
 * 3. В 1626 году индейцы продали Манхэттен за 24$.
 *    Написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */

public class Task3 {
    public static void main(String[] args) {
        int price = 24;
        int year = 1626;
        int thisYear = 2022;
        double rateInPercent = 5;
        possibleIncome(year, thisYear, rateInPercent, price);
    }
    public static void possibleIncome(int year, int thisYear, double rate, double price) {
        int ageDifference = thisYear - (year+1);
        for ( ; ageDifference > 0; ageDifference--) {
            double percent = price*rate/100;
            price = percent + price;
            System.out.println(price);
        }
    }
}
