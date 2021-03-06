package DataStructures.Stack_LinkedList;

public class Main {
    public static void main(String[] args) {

        // LIFO - last in first out

        Stack<String> stack = new Stack<>();

        stack.push("Abc");
        stack.push("Abcdef");
        stack.push("Abcdefghi");
        stack.push("Abcdefghijkl");
        stack.push("Abcdefghijklmno");

        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());
        System.out.println(stack.peek());

    }
}

