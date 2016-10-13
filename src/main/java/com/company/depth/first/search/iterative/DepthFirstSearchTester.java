package com.company.depth.first.search.iterative;

public class DepthFirstSearchTester {
    public static void test() {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        vertexA.addNeghbour(vertexB);
        vertexA.addNeghbour(vertexC);

        vertexB.addNeghbour(vertexD);
        vertexB.addNeghbour(vertexE);

        new DepthFirstSearch().dfs(vertexA);
    }
}
