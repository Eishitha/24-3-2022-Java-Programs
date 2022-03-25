# 24-3-2022-Java-Programs
package com.example.sahitya.abcd;

public interface SumL {
    int add(int a,int b);
}

public class Lambda2 {
    public static void main(String[] args) {
        SumL sum = (a, b) -> (a+b);
            System.out.println(sum.add(10,30));
        }
    }

