package com.company;

import com.company.breadth.first.search.BfsTester;
import com.company.depth.first.search.iterative.DepthFirstSearchTester;
import com.company.depth.first.search.recursive.RecursiveDepthFirstSearchTester;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose algorithm for test:");
        System.out.println("0 - BreadthFirstSearch");
        System.out.println("1 - DepthFirstSearch (Iterative)");
        System.out.println("2 - DepthFirstSearch (Recursive)");
        System.out.print("Choose one:  ");
        switch (new Scanner(System.in).nextInt()){
            case 0:
                BfsTester.test();
                break;
            case 1:
                DepthFirstSearchTester.test();
                break;
            case 2:
                RecursiveDepthFirstSearchTester.test();
                break;
        }
    }
}
