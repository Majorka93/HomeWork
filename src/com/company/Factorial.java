package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // write your code here

        Test t = new Test();
        t.staticHello();

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String text = scanner.next();
        while (!text.equals("q")){
            n = Integer.parseInt(text);
            if (isValidNumber(n)) {
                System.out.println(n + "! =" + factorial(n));
            }
            System.out.println("Введите новое число");
            text = scanner.next();
        }
    }

    private static boolean isValidNumber(int n) {
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (n > 15) {
            System.out.println("Вы ввели очень большое число");
        } else {
            return true;
        }
        return false;
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n-1);
    }
}
