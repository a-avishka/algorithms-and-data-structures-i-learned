package DataStructures.LinkedList.DoublyLinked;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.insert(4);
        list.insert(-10);
        list.insert(2);
        list.insert(40);
        list.insert(7);

        System.out.println(list.get(0));
        list.traverseList();
        System.out.println();
        list.remove(0);
        System.out.println(list.get(90));

        list.traverseList();

    }

}
