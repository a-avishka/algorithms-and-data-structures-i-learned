package DataStructures.Queue;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // FIFO - first in first out

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(22);
        queue.enqueue(333);
        queue.enqueue(4444);

        System.out.println(queue.size());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.size());


        // Java has queue data structure built in by default

        java.util.Queue<String> nameQueue = new LinkedList<>();

        nameQueue.add("James");
        nameQueue.add("Andrew");
        nameQueue.add("Timothy");

        for(String s:nameQueue){
            System.out.println(s);
        }


        System.out.println(nameQueue.size());
        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue.element());
        System.out.println(nameQueue.size());

    }
}
