package Algorithms.Network_flow;

import java.util.ArrayList;
import java.util.List;

public class FlowNetwork {

    private int numOfVertices;
    private int numberOfEdges;
    private List<List<Edge>> adjacencyList;

    public FlowNetwork(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.numberOfEdges = 0;
        this.adjacencyList = new ArrayList<>();

        for (int i = 0; i <numOfVertices ; i++) {
            List<Edge> edgeList = new ArrayList<>();
            adjacencyList.add(edgeList);

        }
    }

    public int getNumOfVertices() {
        return numOfVertices;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void addEdge(Edge e){
        Vertex v = e.getStartVertex();
        Vertex w = e.getEndVertex();
        adjacencyList.get(v.getId()).add(e);
        adjacencyList.get(w.getId()).add(e);
        numberOfEdges++;
    }

    public List<Edge> getAdjacencyList(Vertex vertex){
        return adjacencyList.get(vertex.getId());
    }
}
