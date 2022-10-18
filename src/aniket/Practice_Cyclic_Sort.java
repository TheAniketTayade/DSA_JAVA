package aniket;

import java.util.Arrays;

public class Practice_Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic_sort_1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic_sort_1(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
}
