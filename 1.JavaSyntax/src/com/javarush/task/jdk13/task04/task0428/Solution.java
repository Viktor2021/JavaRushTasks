package com.javarush.task.jdk13.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
