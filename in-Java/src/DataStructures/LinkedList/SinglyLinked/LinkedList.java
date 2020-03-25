package DataStructures.LinkedList.SinglyLinked;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int listSize;

    @Override
    public void insert(T data) {


        ++this.listSize;

        if (root == null) {
            /*
             * each time insert method is called with a data parameter, it increments the listsize
             * by 1 and if the root node is pointing to null , it means there are no elements in list,
             * so create a new node using the provided data as its parameter and set it as the root.
             */
            this.root = new Node<>(data);
        } else {
            /*
             * if the root isn't pointing to null it means there are elements in the list, so we have to create a new node
             * using the data provided as its parameter and setNextNode to the current root node as
             * it is the current first element in the list, so the newly created node will be referencing the
             * previous first element as its next node.
             */
            insertDataAtaBeginning(data);
        }

    }

    // O(1)
    private void insertDataAtaBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    /*
     * to insert an element at the end we have sequentially iterate through through all the nodes in the list starting from
     * the root until we reach the node referencing null as the nextnode, once we reach the end we create a new node
     * and set the current final node to reference this new node as the node next and set the next node to reference
     * to null.
     * */
    // O(N)
    private void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());  // recursive function
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (this.root == null) return;

        --this.listSize;

        if (this.root.getData().compareTo(data) == 0) { // if list size is 1
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> currentNode) {
        while (currentNode != null) {
            if (currentNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {

        if(this.root == null) return;

        Node<T> currentNode = this.root;

        while (currentNode!= null){
            System.out.print(currentNode+"  --->  ");
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.listSize;
    }
}
