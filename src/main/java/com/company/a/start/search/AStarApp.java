package com.company.a.start.search;

/**
 * Created by markdz
 * on 14.10.2016.
 */
public class AStarApp {
    public static void main() {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");

        node1.addNeighbour(new Edge(10, node2));
        node1.addNeighbour(new Edge(100, node4));
        node2.addNeighbour(new Edge(10, node3));
        node3.addNeighbour(new Edge(10, node4));

        Algorithm algorithm = new Algorithm();

        algorithm.aStarSearch(node1, node4);

        System.out.println(algorithm.printPath(node4));
    }
}
