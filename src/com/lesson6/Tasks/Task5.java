package com.lesson6.Tasks;

/**
 * 5. Написать программу, которая проходит циклом по английскому
 *    алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 *    пока не встретит гласную (т.е. вывести согласные на консоль).
 */

public class Task5 {
    public static void main(String[] args) {
        consonant();
    }
    public static void consonant () {
        for (char ch = 'b'; ch <= 'z'; ch++) {
            if (ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                continue;
            }
            System.out.print(ch + " ");
        }
    }
}
