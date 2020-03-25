package DataStructures.Stack_Array;

public class Stack<T> {

    private T[] stack;
    private int numberOfItems;

    public Stack(){
        this.stack = (T[]) new Object[1];
    }

    public  void push(T newData){
        if(numberOfItems == this.stack.length){
            resize(2*this.stack.length);
        }
        this.stack[numberOfItems++] = newData;
    }

    public T pop(){
        T itemToPop = this.stack[--numberOfItems];

        if(numberOfItems >0 && numberOfItems == this.stack.length/4){
            resize(this.stack.length/2);
        }

        return itemToPop;

    }

    public boolean isEmpty(){
        return this.numberOfItems ==0;
    }

    public int size(){
        return this.numberOfItems;
    }

    // O(N) linear time complexity
    private void resize(int capacity) {
        T[] stackCopy =  (T[]) new Object[capacity];

        for(int i= 0;i<numberOfItems;i++){
            stackCopy[i] = this.stack[i];
        }

        this.stack = stackCopy;
    }
}
