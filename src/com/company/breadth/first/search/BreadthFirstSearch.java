package com.company.breadth.first.search;


import java.util.LinkedList;
import java.util.Queue;


class BreadthFirstSearch {

    void bfs(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()){
            Vertex mVertex = queue.remove();
            System.out.println(mVertex);

            mVertex.getNeighbours().stream().filter(Vertex::isNotVisited).forEach(vertex -> {
                vertex.setVisited(true);
                queue.add(vertex);
            });
        }
    }
}
