package Algorithms.Sorting.Comparison_based.Insertion_sort;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //O(N^2)

        Random random = new Random();
        int[] nums = new int[100];
        for(int i = 0;i<nums.length;i++){
            nums[i] = random.nextInt(100) - 25;
        }

        for(int i =1;i<nums.length;i++){
            int j =i;
            while((j>0) && (nums[j-1] > nums[j])){
                swap(nums,j,j-1);
                j--;
            }
        }

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