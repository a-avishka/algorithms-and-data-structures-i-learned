package Algorithms.Network_flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int numOfVertices = 4;
        int numOfVertices = sc.nextInt();
        int numOfEdges = sc.nextInt();


        FlowNetwork flowNetwork = new FlowNetwork(numOfVertices);

//        Vertex v1 = new Vertex(0, "s");
//        Vertex v2 = new Vertex(1, "A");
//        Vertex v3 = new Vertex(2, "B");
//        Vertex v4 = new Vertex(3, "t");

//        List<Vertex> vertexList = new ArrayList<>();
//        vertexList.add(v1);
//        vertexList.add(v2);
//        vertexList.add(v3);
//        vertexList.add(v4);

//        flowNetwork.addEdge(new Edge(v1, v2, 4));
//        flowNetwork.addEdge(new Edge(v1, v3, 5));
//        flowNetwork.addEdge(new Edge(v2, v4, 7));
//        flowNetwork.addEdge(new Edge(v3, v2, 4));
//        flowNetwork.addEdge(new Edge(v3, v4, 1));

//        MaximumFlow maximumFlow = new MaximumFlow(flowNetwork, v1, v4);

        Vertex[] vertexList = new Vertex[numOfVertices];
        for (int i = 0; i < numOfVertices ; i++) {
            vertexList[i] = new Vertex(i,String.valueOf(i+1));
        }

        for (int i = 0; i < numOfEdges ; i++) {
            int startVertex = sc.nextInt();
            int endVertex = sc.nextInt();
            int capacity = sc.nextInt();

            flowNetwork.addEdge(new Edge(vertexList[startVertex-1],vertexList[endVertex-1],capacity));

        }


        MaximumFlow maximumFlow = new MaximumFlow(flowNetwork, vertexList[0], vertexList[vertexList.length-1]);

        System.out.println("Maximum flow is : " + maximumFlow.getMaxFlowValue());

        System.out.println();
        System.out.println("Vertices in the min cut set : ");
        for (int i = 0; i < vertexList.length; i++) {
            if (maximumFlow.isInCut(i)) {
                System.out.print(vertexList[i] + "    ");
            }

        }
    }
}


//5 7
//1 2 2
//2 5 5
//1 3 6
//3 4 2
//4 5 1
//3 2 3
//2 4 1

//4 5
//1 2 10000
//1 3 10000
//2 3 1
//3 4 10000
//2 4 10000


//3 3
//5 5 5
//4 4 6
//4 5 4


//6 11
//1 2 10
//1 3 8
//2 3 5
//3 2 4
//2 4 5
//4 3 7
//3 5 10
//4 6 3
//5 4 10
//4 5 6
//5 6 14

//6 10
//        1 2 10
//        1 3 8
//        2 3 5
//        3 2 4
//        2 4 5
//        4 3 7
//        3 5 10
//        4 6 3
//        5 4 10
//        4 5 6
