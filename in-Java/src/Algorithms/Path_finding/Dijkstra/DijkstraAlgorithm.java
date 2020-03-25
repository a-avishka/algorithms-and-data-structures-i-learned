package Algorithms.Path_finding.Dijkstra;

import java.util.*;

public class DijkstraAlgorithm {

    public void computePath(Vertex sourceVertex) {

        sourceVertex.setMinDistanceFromSource(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            Vertex actualVertex = priorityQueue.poll();

            for (Edge edge : actualVertex.getEdgeList()) {
                Vertex v = edge.getEndVertex();

                double newDistance = actualVertex.getMinDistanceFromSource() + edge.getWeight();

                if (newDistance < v.getMinDistanceFromSource()) {
                    priorityQueue.remove(v);
                    v.setMinDistanceFromSource(newDistance);
                    v.setPredecessor(actualVertex);
                    priorityQueue.add(v);
                }
            }
        }

    }


    public List<Vertex> getShortestPathTo(Vertex targetVertex) {

        List<Vertex> shortestPathToTarget = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            shortestPathToTarget.add(vertex);
        }

        Collections.reverse(shortestPathToTarget);

        return shortestPathToTarget;
    }

}
