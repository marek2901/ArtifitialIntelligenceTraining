package com.company.a.start.search;

import java.util.*;

/**
 * Created by markdz
 * on 13.10.2016.
 */
public class Algorithm {

    public void aStarSearch(Node sourceNode, Node goalNode) {
        Set<Node> exploredNodes = new HashSet<>();

        PriorityQueue<Node> unexploredNodes = new PriorityQueue<>();

        sourceNode.setgScore(0);
        unexploredNodes.add(sourceNode);
        boolean isFound = false;

        while (!unexploredNodes.isEmpty() && !isFound) {
            Node current = unexploredNodes.poll();
            exploredNodes.add(current);

            if (current.getValue().equals(goalNode.getValue())) {
                isFound = true;
            }

            for (Edge e : current.getAdjacenciesList()) {
                Node childNode = e.getTargetNode();
                double cost = e.getCost();

                double tempGScore = current.getfScore() + cost;
                double tempFScore = tempGScore + heuristic(childNode, goalNode);

                if (exploredNodes.contains(childNode) && tempFScore >= childNode.getfScore()) {
                    continue;
                } else if (!unexploredNodes.contains(childNode) || tempFScore < childNode.getfScore()) {
                    childNode.setParentNode(current);
                    childNode.setgScore(tempGScore);
                    childNode.setfScore(tempFScore);

                    if (unexploredNodes.contains(childNode)) {
                        unexploredNodes.remove(childNode);
                    }

                    unexploredNodes.add(childNode);
                }
            }
        }
    }

    public List<Node> printPath(Node targetNode) {
        List<Node> paths = new ArrayList<>();

        for (Node node = targetNode; node != null; node = node.getParentNode()) {
            paths.add(node);
        }

        Collections.reverse(paths);

        return paths;
    }

    private double heuristic(Node node1, Node node2) {
        return Math.abs(node1.getX() - node2.getX()) + Math.abs(node1.getY() - node2.getY());
    }
}
