package sorting_algorithms;

import java.util.Arrays;

public class Cycle_Sort_Main {

    public static void main(String[] args) {
	    int[] arr = {5,4,3,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclic_sort(int[] arr){
        int i = 0;
        // This is just comment

        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
