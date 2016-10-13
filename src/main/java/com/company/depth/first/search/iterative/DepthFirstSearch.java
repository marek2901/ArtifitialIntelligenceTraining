package com.company.depth.first.search.iterative;

import java.util.Stack;

public class DepthFirstSearch {
    private Stack<Vertex> stack = new Stack<>();

    public void dfs(Vertex root) {
        stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex currentVertex = stack.pop();
            System.out.print(currentVertex);

            currentVertex.getAdjecanciesList().stream().filter(v -> !v.isVisited()).forEach(v -> {
                v.setVisited(true);
                v.setPredecessor(currentVertex);
                stack.push(v);
            });
        }
    }
}
