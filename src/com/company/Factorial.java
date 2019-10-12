package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Введите число");
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {

            System.out.println("Вы ввели отрицательное число");
        } else if (n > 15) {
            System.out.println("Вы ввели очень большое число");
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
            System.out.println(n + "! =" + result);
        }
    }
}
