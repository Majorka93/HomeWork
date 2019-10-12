package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // write your code here

        int n;
        System.out.println("Введите число");
        String text = new Scanner(System.in).next();
        while (!text.equals("q")){
            n = Integer.parseInt(text);
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
            System.out.println("Введите новое число");
            text = new Scanner(System.in).next();
        }
    }
}
