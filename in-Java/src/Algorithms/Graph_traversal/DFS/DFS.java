package Algorithms.Graph_traversal.DFS;

import java.util.List;
import java.util.Stack;

public class DFS<T extends Comparable<T>> {
    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex<T>> vertexList){ // we add all vertices to list because if it wasn't a fully connected graph we will not be able to go to the next part of the graph starting from the root
        for(Vertex<T> v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
//                dfsWithStack(v);
                dfsWithRecursion(v);
            }
        }
    }

    private void dfsWithStack(Vertex<T> root){
        this.stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()){
            Vertex<T> currentVertex = this.stack.pop();
            System.out.println(currentVertex+" ");

            for(Vertex<T> v:currentVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }

        }
    }

    private void dfsWithRecursion(Vertex<T> root){
        System.out.println(root+" ");

        for(Vertex<T> vertex:root.getNeighbourList()){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsWithRecursion(vertex);
            }
        }
    }
}
