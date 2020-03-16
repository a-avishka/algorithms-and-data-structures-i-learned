package Algorithms.Sorting.Comparison_based.Merge_sort;

import java.util.Random;

public class Main {

    // O(NlogN)

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[100];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(100) - 25;
        }

        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.mergeSort(0,nums.length-1);
        mergeSort.showArray();
    }
}