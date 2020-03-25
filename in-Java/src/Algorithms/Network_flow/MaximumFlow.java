package Algorithms.Network_flow;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumFlow {

    private boolean[] marked;
    private Edge[] edgeTo;
    private double maxFlowValue;

    public MaximumFlow(FlowNetwork flowNetwork, Vertex s, Vertex t) {

        while (hasAugmentingPath(flowNetwork, s, t)) {
            double minFlow = Double.POSITIVE_INFINITY;

            for (Vertex v = t; v != s; v = edgeTo[v.getId()].getOther(v)) {
                minFlow = Math.min(minFlow, edgeTo[v.getId()].getResidualCapacity(v));
            }

            for (Vertex v = t; v != s; v = edgeTo[v.getId()].getOther(v)) {
                edgeTo[v.getId()].addResidualFlowTo(v, minFlow);
            }

            maxFlowValue = maxFlowValue + minFlow;
        }
    }

    private boolean hasAugmentingPath(FlowNetwork flowNetwork, Vertex s, Vertex t) {

        edgeTo = new Edge[flowNetwork.getNumOfVertices()];
        marked = new boolean[flowNetwork.getNumOfVertices()];

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(s);
        marked[s.getId()] = true;

        while (!queue.isEmpty() && !marked[t.getId()]) {

            Vertex v = queue.remove();

            for (Edge e : flowNetwork.getAdjacencyList(v)) {
                Vertex w = e.getOther(v);

                if (e.getResidualCapacity(w) > 0) {
                    if (!marked[w.getId()]) {
                        edgeTo[w.getId()] = e;
                        marked[w.getId()] = true;
                        queue.add(w);
                    }
                }
            }
        }

        return marked[t.getId()];

    }

    public boolean isInCut(int index){
        return marked[index];
    }

    public double getMaxFlowValue(){
        return this.maxFlowValue;
    }
}
