package Algorithms.Graph_traversal.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS<T extends Comparable<T>> {


    public void bfs(Vertex<T> root){ // the root node has to be specified by the user

        Queue<Vertex<T>> queue = new LinkedList<>();  // a queue is created
        root.setVisited(true); // the root node then set to  be visited
        queue.add(root); // and added to the queue

        while (!queue.isEmpty()){ // while there are elements in the queue this loop will iterate
            Vertex<T> currentVertex = queue.remove(); //the current node is then de-queued and remove() method will return the removed vertex which is set to the currentVertex variable
            System.out.println(currentVertex+" "); // the node is then printed to the console

            for(Vertex<T> v: currentVertex.getNeighbourList()){ // using a for loop we iterate through all the vertices of the currentVertex element which is in a list
                if(!v.isVisited()){
                    v.setVisited(true); // if the vertex is not visited we set it as visited
                    queue.add(v); // and is added to the queue
                }
            }


        }
    }
}
