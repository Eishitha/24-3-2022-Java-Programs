# 24-3-2022-Java-Programs
package com.example.sahitya.abcd;

import java.time.LocalDate;

public class MainLocaleDate {
    public static void main(String[] args) {
        LocalDate t = LocalDate.now();
        System.out.println(t);

        LocalDate t1 = LocalDate.of(2020,1,4);
        System.out.println(t1);
    }
}
