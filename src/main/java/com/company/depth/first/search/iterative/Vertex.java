package com.company.depth.first.search.iterative;

import java.util.ArrayList;
import java.util.List;

class Vertex {
    private String name;
    private boolean visited = false;
    private List<Vertex> adjecanciesList = new ArrayList<>();
    private Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
    }

    public void addNeghbour(Vertex neigbour) {
        adjecanciesList.add(neigbour);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjecanciesList() {
        return adjecanciesList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return String.format("\nVertex[name: %s]\n", this.name);
    }
}
