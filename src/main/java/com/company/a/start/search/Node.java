package com.company.a.start.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by markdz
 * on 13.10.2016.
 */
public class Node implements Comparable<Node> {

    private String value;
    private double gScore;
    private double fScore;

    private double x;
    private double y;

    private List<Edge> adjacenciesList = new ArrayList<>();
    private Node parentNode;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public int compareTo(Node o) {
        return Double.compare(fScore, o.getfScore());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public double getfScore() {
        return fScore;
    }

    public void setfScore(double fScore) {
        this.fScore = fScore;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public void addNeighbour(Edge edge) {
        this.adjacenciesList.add(edge);
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }
}
