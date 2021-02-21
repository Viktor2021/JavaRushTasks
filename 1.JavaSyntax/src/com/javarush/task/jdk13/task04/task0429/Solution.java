package com.javarush.task.jdk13.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countTrue = 0;
        int countFalse = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) {
                countTrue++;
            } else if (a < 0) {
                countFalse++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countFalse);
        System.out.println("количество положительных чисел: " + countTrue);

    }
}
