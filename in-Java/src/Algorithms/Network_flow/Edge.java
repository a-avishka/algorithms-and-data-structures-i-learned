package Algorithms.Network_flow;

public class Edge {

    private Vertex startVertex;
    private Vertex endVertex;
    private  final double capacity;
    private double flow;

    public Edge(Vertex startVertex, Vertex endVertex, double capacity) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.capacity = capacity;
        this.flow = 0.0;
    }

    public Edge(Edge edge){
        this.startVertex = edge.getStartVertex();
        this.endVertex = edge.getEndVertex();
        this.capacity = edge.getCapacity();
        this.flow = edge.getFlow();
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }

    public Vertex getOther(Vertex vertex){
        if(vertex == startVertex){
            return endVertex;
        }else{
            return startVertex;
        }
    }

    public double getResidualCapacity(Vertex vertex){
        if(vertex == startVertex){
            return flow; // backward edge
        }else{
            return capacity-flow; // forward edge
        }
    }

     public void addResidualFlowTo(Vertex vertex,double deltaFlow){
        if(vertex == startVertex){
            flow = flow - deltaFlow; //backward edge
        }else {
            flow = flow + deltaFlow; // forward edge
        }
     }

    @Override
    public String toString() {
        return "Edge{" +
                "startVertex=" + startVertex +
                ", endVertex=" + endVertex +
                ", capacity=" + capacity +
                ", flow=" + flow +
                '}';
    }
}
