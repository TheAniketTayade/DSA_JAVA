package aniket;

import java.util.Arrays;

public class BubbleSortMain {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5,2,3,4,6,1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                
            }
        }
    }
}
