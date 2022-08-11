package com.lesson6;

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
            forEx();
        }
    }
    public static void forEx () {
        for (int value = 10; value > 0; value--) {
            if (value == 5) {
                continue;
            }
            System.out.println(value);
        }
    }
}
