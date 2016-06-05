package com.company.depth.first.search.recursive;

import java.util.ArrayList;
import java.util.List;

class Vertex {
    private String name;
    private boolean visited = false;
    private List<Vertex> adjecanciesList = new ArrayList<>();

    public Vertex(String name){
        this.name = name;
    }

    public void addNeghbour(Vertex neigbour){
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

    @Override
    public String toString() {
        return String.format("\nVertex[name: %s]\n", this.name);
    }
}
