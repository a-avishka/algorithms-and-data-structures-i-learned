package DataStructures.LinkedList.DoublyLinked;


public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int listSize;

    @Override
    public void insert(T data) {
        ++listSize;
        if (root == null) {
            this.root = new Node<>(data);
        } else {
            insertDataAtBeginning(data);
        }

    }

    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root.setPreviousNode(newNode);
        this.root = newNode;
    }

    @Override
    public void remove(T data) {
        if (this.root == null) return; // if list empty

        --this.listSize;

        if (this.root.getData().compareTo(data) == 0) { //if list contains only one element
            this.root = this.root.getNextNode(); // equivalent to this.root = null;
        } else {
            removeNode(data, this.root);
        }
    }

    private void removeNode(T data, Node<T> nodeToRemove) {

        while (nodeToRemove.getNextNode() != null){

            Node<T> next = nodeToRemove.getNextNode();
            Node<T> prev = nodeToRemove.getPreviousNode();

            if (nodeToRemove.getData().compareTo(data) == 0) {
                if (prev != null) {
                    prev.setNextNode(next); // set the previous node to reference the next node

                }
                if (next != null) {
                    next.setPreviousNode(prev); // set the next noe to reference the previous node

                }
                return;
            }

            nodeToRemove = next;
        }



    }

    @Override
    public void remove(Node<T> node) {
        removeNode(node);
    }

    private void removeNode(Node<T> node) {
        node.getPreviousNode().setNextNode(node.getNextNode()); // set the previous node to reference the next node
        node.getNextNode().setPreviousNode(node.getPreviousNode()); // set the next noe to reference the previous node

    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public T get(int index) {
        T data = this.root.getData();
        Node<T> prev = this.root.getPreviousNode();
        Node<T> next = this.root.getNextNode();
        Node<T> copyNode = new Node<>(data);
        copyNode.setPreviousNode(prev);
        copyNode.setNextNode(next);
        for (int i = 0; i < index; i++) {
            copyNode = copyNode.getNextNode();
        }
        return copyNode.getData();
    }


    @Override
    public void traverseList() {
        if (this.root == null) return;

        Node<T> currentNode = this.root;

        while (currentNode != null) {
            System.out.print(currentNode + "  --->  ");
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.listSize;
    }
}
