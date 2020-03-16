package Algorithms.Sorting.Comparison_based.Quick_sort;

import java.util.Random;

public class Main {

    // average case O(NlogN)
    // worst case O(N^2)


    public static void main(String[] args) {

        Random random = new Random();
        int[] nums = new int[100];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(100) - 25;
        }

        QuickSort quickSort = new QuickSort(nums);
        quickSort.sort();
        quickSort.showArray();
    }
}