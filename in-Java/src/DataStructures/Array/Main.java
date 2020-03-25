package DataStructures.Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // O(1) random access
        // Getting an element when index is known is O(1)
        int num = arr[2];
        System.out.println(num);

        // O(N) "Linear search" --> O(logN) "Binary Trees" --> O(1) "HashTables"
        // Searching for an element in array is O(N)
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==4){
                System.out.println("Found 4 at index: "+i);
                break;
            }
        }

        // Adding or removing an element at the end of array is O(N)
        // But to add or remove an element at the middle or beginning we have shift all elements after the index we added an element or removed an element from, so it is O(N)

    }
}
