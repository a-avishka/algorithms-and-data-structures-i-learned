package Algorithms.Graph_traversal.DFS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DFS dfs = new DFS();

        Vertex<String> vertex1 = new Vertex<>("Q");
        Vertex<String> vertex2 = new Vertex<>("W");
        Vertex<String> vertex3 = new Vertex<>("E");
        Vertex<String> vertex4 = new Vertex<>("R");
        Vertex<String> vertex5 = new Vertex<>("T");
        Vertex<String> vertex6 = new Vertex<>("Y");
        Vertex<String> vertex7 = new Vertex<>("U");

        vertex1.addNeighbourVertex(vertex2);
        vertex1.addNeighbourVertex(vertex4);
        vertex4.addNeighbourVertex(vertex5);
        vertex2.addNeighbourVertex(vertex3);
        vertex3.addNeighbourVertex(vertex6);
        vertex3.addNeighbourVertex(vertex7);

        List<Vertex> list = new ArrayList<>();
        list.add(vertex1);
        list.add(vertex2);
        list.add(vertex3);
        list.add(vertex4);
        list.add(vertex5);
        list.add(vertex6);
        list.add(vertex7);

        dfs.dfs(list);


    }
}
