package DataStructures.Queue;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    // O(1)
    public boolean isEmpty(){
        return this.count==0;
    }

    // O(1)
    public int size(){
        return this.count;
    }

    // O(1)
    public void enqueue(T newData){
        this.count++;
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<T>(newData);
        if(this.firstNode != null) {
            oldLastNode.setNextNode(this.lastNode);
        }else{
            this.firstNode = this.lastNode;
        }
    }

    // O(1)
    public T dequeue(){
        this.count--;
        T dataToDeQueue = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();

        if(firstNode==null){
            this.lastNode = null;
        }

        return dataToDeQueue;
    }
}
