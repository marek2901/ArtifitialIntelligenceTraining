package com.company.depth.first.search.recursive;

public class DepthFirstSearch {
    public void dfs(Vertex vertex){
        System.out.print(vertex);
        vertex.setVisited(true);
        vertex.getAdjecanciesList().stream().filter(v -> !v.isVisited()).forEach(this::dfs);
    }
}
