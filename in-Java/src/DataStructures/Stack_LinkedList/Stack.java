package DataStructures.Stack_LinkedList;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    //O(1)
    public void push(T newData) {
        this.count++;
        if (this.root == null) {
            this.root = new Node<>(newData);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }

    public T peek(){
        return this.root.getData();
    }

    //O(1) - remove from beginning
    public T pop() {
        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop;
    }

    //O(1)
    public int size() {
        return this.count;
    }

    //O(1)
    public boolean isEmpty() {
        return this.root == null;
    }
}
