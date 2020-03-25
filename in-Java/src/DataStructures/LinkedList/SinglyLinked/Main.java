package DataStructures.LinkedList.SinglyLinked;

public class Main {

    /*
     * Inserting at the beginning takes O(1) time complexity
     * Inserting at the end or at the middle takes O(N) time complexity
     *
     * Removing items at the beginning takes 0(1) time complexity
     * Removing items at any other given position takes 0(N) time complexity
     *
     *                       LinkedList      Arrays
     * Search                    O(N)         O(1) if index is given, else O(N)
     * Insert at the start       O(1)         O(N)
     * Insert at the end         O(N)         O(1)
     * Waste space               O(N)          0
     *
     *
     * */


    public static void main(String[] args) {

//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.insert(10);
//        linkedList.insert(2);
//        linkedList.insert(-5);
//        linkedList.insert(15);
//        linkedList.insert(7);
//        linkedList.insert(9);
//
//        linkedList.traverseList();
//
//        linkedList.remove(15);
//        linkedList.remove(2);
//
//        linkedList.traverseList();

        List<Person> linkedList = new LinkedList<>();
        Person p1 = new Person(2, "Andrew");
        Person p2 = new Person(23, "Babara");
        Person p3 = new Person(19, "Cantello");
        Person p4 = new Person(13, "Diego");
        Person p5 = new Person(27, "Ellie");

        linkedList.insert(p1);
        linkedList.insert(p2);
        linkedList.insert(p3);
        linkedList.insert(p4);
        linkedList.insert(p5);

//        linkedList.traverseList();

        linkedList.remove(p3);

        linkedList.traverseList();



    }

}
