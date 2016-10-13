package com.company;

import java.util.Scanner;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Choose algorithm for test:");
        System.out.println("0 - BreadthFirstSearch");
        System.out.println("1 - DepthFirstSearch (Iterative)");
        System.out.println("2 - DepthFirstSearch (Recursive)");
        System.out.println("3 - IterativeDeepeningDepthFirstSearch");
        System.out.println("4 - AStar Search");
        System.out.print("Choose one:  ");
        switch (new Scanner(System.in).nextInt()) {
            case 0:
                com.company.breadth.first.search.BfsTester.test();
                break;
            case 1:
                com.company.depth.first.search.iterative.DepthFirstSearchTester.test();
                break;
            case 2:
                com.company.depth.first.search.recursive.RecursiveDepthFirstSearchTester.test();
                break;
            case 3:
                com.company.iterative.deepening.deth.first.search.IterativeDeepeningDepthFirstSearchTester.test();
                break;
            case 4:
                com.company.a.start.search.AStarApp.main();
                break;
        }
    }
}
