package Algorithms.Path_finding.Dijkstra;

public class Edge {

    private double weight;
    private Vertex endVertex;

    public Edge(double weight, Vertex endVertex) {
        this.weight = weight;
        this.endVertex = endVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }
}
