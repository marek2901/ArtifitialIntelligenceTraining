package com.company.iterative.deepening.deth.first.search;

public class IterativeDeepeningDepthFirstSearchTester {
    public static void test(){
        Node node1 = new Node("A");
        Node node2 = new Node("b");
        Node node3 = new Node("c");

        node1.addNeghbour(node2);
        node2.addNeghbour(node3);

        Algorithm algorithm = new Algorithm(node3);

        algorithm.runDeepeningSearch(node1);
    }
}
