package DataStructures.LinkedList.DoublyLinked;

public interface List<T extends Comparable<T>> {
    void insert(T data);
    void remove(T data);
    void remove(Node<T> node);
    boolean isEmpty();
    T get(int index);
    void traverseList();
    int size();
}
