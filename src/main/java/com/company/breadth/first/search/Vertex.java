package com.company.breadth.first.search;

import java.util.ArrayList;
import java.util.List;

class Vertex {

    private int data;

    private boolean isVisited = false;

    private List<Vertex> neighbours = new ArrayList<>();

    Vertex(int data) {
        this.data = data;
    }

    void addNeighbour(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    boolean isNotVisited() {
        return !isVisited;
    }

    void setVisited(boolean visited) {
        isVisited = visited;
    }

    List<Vertex> getNeighbours() {
        return neighbours;
    }

    @Override
    public String toString() {
        return String.format("My value is: %s", this.data);
    }
}
