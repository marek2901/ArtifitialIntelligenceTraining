package com.company.iterative.deepening.deth.first.search;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private int depthLevel;
    private List<Node> adjecenciesList = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void addNeghbour(Node node) {
        this.adjecenciesList.add(node);
    }

    public List<Node> getAdjecenciesList() {
        return adjecenciesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    @Override
    public String toString() {
        return String.format("\n[ Node::name: %s ]\n", name);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Node && this.name.equals(((Node) obj).name);
    }
}
