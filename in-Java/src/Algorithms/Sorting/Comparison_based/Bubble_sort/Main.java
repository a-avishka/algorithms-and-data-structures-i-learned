package Algorithms.Sorting.Comparison_based.Bubble_sort;

import java.util.Random;

public class Main {

    //O(N^2)

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[100];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(100) - 25;
        }

        showArray(nums);

        for(int i = 0 ; i<nums.length;i++){
            for(int j =0; j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        System.out.println();
        showArray(nums);
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private static void showArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }

    }



}