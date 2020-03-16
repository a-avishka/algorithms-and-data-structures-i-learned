package Algorithms.Sorting.Non_comparison_based.Counting_sort;

import java.util.Random;

public class Main {

    //O(N+K)

    public static void main(String[] args) {

        Random random = new Random();
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100000) - 50000;
        }


        // Finds the min and max from list
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // creates a list of length max-min+1
        int[] newArray = new int[max - min + 1];

        // iterates through the given list of numbers and increments the element at index of the new list to correspond the number of each element in the given list
        for (int i = 0; i < nums.length; i++) {
            newArray[nums[i] - min]++;
        }

        // iterates through the new list and prints out the  index for times the value it holds.
        for (int j = 0; j < newArray.length; j++) {
            for (int i = 0; i < newArray[j]; i++) {
                System.out.print((j + min) + "  ");
            }
        }

    }
}
