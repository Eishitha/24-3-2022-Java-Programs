# 24-3-2022-Java-Programs
 package com.example.sahitya.abcd;

import java.util.LinkedHashSet;
public class MainLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> trees = new LinkedHashSet<>();
        trees.add("Banyan");
        trees.add("Neem");
        trees.add("Tulasi");
        trees.add("Eucalyptus");
        trees.add("Aloe vera");
        System.out.println("Trees:"+trees);

        trees.remove("Tulasi");
        System.out.println("Remaining Trees:"+trees);

        trees.removeAll(trees);
        System.out.println("Modified Trees:"+trees);

    }
}
