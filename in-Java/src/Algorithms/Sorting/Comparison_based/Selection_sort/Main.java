package Algorithms.Sorting.Comparison_based.Selection_sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // O(N^2)

        Random random = new Random();
        int[] nums = new int[100];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(100) - 25;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }

        }

        showArray(nums);
    }

    private static void showArray(int[] nums){
        for(int num:nums){
            System.out.print(num+"  ");
        }

    }

}