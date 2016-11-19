package com.javaonlinecourse.b1lesson3.homework;

import java.util.Arrays;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Создайте массив из всех чётных чисел от 2 до 20.
 */
public class HW01 {
    public static void main(String[] args) {

        int start = 2;
        int stop = 20;

        int size = 0;
        int key = 0;
        for (int x = start; x <= stop; x++){
            if (x % 2 == 0)
            {
                size++;
            }
        };

        int[] ar = new int[size];
        for (int x = start; x <= stop; x++) {

            if (x % 2 == 0)
            {
                ar[key] = x; key++;
            }
        }

        System.out.println(Arrays.toString(ar));

    }
}
