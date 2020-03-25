package Algorithms.Graph_traversal.BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T extends Comparable<T>> {

    private T data;
    private boolean visited;
    private List<Vertex<T>> neighbourList;

    public Vertex(T data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex<T>> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void addNeighbourVertex(Vertex<T> vertex){  // add a given vertex to the neighbourList
        this.neighbourList.add(vertex);
    }

    @Override
    public String toString() {
        return this.data.toString();
    }


}
