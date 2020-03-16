package Algorithms.Sorting.Comparison_based.Quick_sort;

public class QuickSort {

    private int[] nums;

    public QuickSort(int[] nums) {
        this.nums = nums;
    }

    public void sort() {
        quickSort(0, nums.length - 1);
    }

    private void quickSort(int low, int high) {
        if (low >= high) return;

        int pivot = partition(low, high);
        quickSort(low, pivot - 1);
        quickSort(pivot + 1, high);
    }

    public int partition(int low, int high) {
        int pivotIndex = (low + high) / 2; // gets the middle element as pivot
        swap(pivotIndex, high); // swaps the middle with last

        int i = low; // sets i to be the first element

        /*
         * on each iteration it compares the jth element with the last element
         * and if its less than or equal it swaps
         */
        for (int j = low; j < high; j++) {
            if (nums[j] <= nums[high]) {
                swap(i, j);
                i++;
            }
        }

        // then swaps the element before last with the last last element pivot
        swap(i, high);
        return i;
    }

    public void swap(int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void showArray() {
        for (int num : nums) {
            System.out.print(num + "  ");
        }
    }
}