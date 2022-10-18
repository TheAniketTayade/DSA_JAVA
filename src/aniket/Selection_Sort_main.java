package aniket;
import java.util.Arrays;

public class Selection_Sort_main {

    public static void Selection_Sort(String[] args) {
	// write your code here
        int[] arr = {5,6,4,2,3,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = Get_max_index(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int Get_max_index(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        // here we will swap max element with position element
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
