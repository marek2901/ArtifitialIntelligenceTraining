package com.company.iterative.deepening.deth.first.search;

import java.util.Stack;

public class Algorithm {
    private Node targetNode;
    private boolean isTargetFound;

    public Algorithm(Node targetNode) {
        this.targetNode = targetNode;
    }

    public void runDeepeningSearch(Node startingNode){
        int depth = 0;

        while (!isTargetFound){
            dfs(startingNode, depth);
            depth ++;
        }

    }

    private void dfs(Node startingNode, int depth) {
        Stack<Node> stack = new Stack<>();
        startingNode.setDepthLevel(0);
        stack.push(startingNode);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            System.out.println(currentNode);

            if(currentNode.equals(this.targetNode)){
                System.out.println("Found node ::)");
                this.isTargetFound = true;
                return;
            }

            if(currentNode.getDepthLevel() >= depth){
                continue;
            }

            for (Node node : currentNode.getAdjecenciesList()) {
                node.setDepthLevel(currentNode.getDepthLevel() + 1);
                stack.push(node);
            }

        }
    }
}
