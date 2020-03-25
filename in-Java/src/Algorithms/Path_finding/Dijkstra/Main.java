package Algorithms.Path_finding.Dijkstra;

public class Main {
    public static void main(String[] args) {

        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");
        Vertex v3 = new Vertex("D");

        v0.addEdge(new Edge(5,v1));
        v0.addEdge(new Edge(3,v2));
        v1.addEdge(new Edge(7,v2));
        v2.addEdge(new Edge(9,v3));
        v3.addEdge(new Edge(1,v0));

        DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
        algorithm.computePath(v0);

        System.out.println(algorithm.getShortestPathTo(v3));
    }
}
