package Algorithms.Path_finding.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private List<Edge> edgeList;
    private boolean visited;
    private Vertex predecessor;
    private double minDistanceFromSource = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.edgeList = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        this.edgeList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getMinDistanceFromSource() {
        return minDistanceFromSource;
    }

    public void setMinDistanceFromSource(double minDistanceFromSource) {
        this.minDistanceFromSource = minDistanceFromSource;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.minDistanceFromSource, o.getMinDistanceFromSource());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
