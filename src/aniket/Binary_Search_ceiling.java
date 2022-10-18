package aniket;
// find smallest number greater than target element

public class Binary_Search_ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        int target = 55;
        System.out.println(ceiling(arr, target));

    }
    static int ceiling(int[] arr, int target){
        int end = arr.length - 1;
        int start = arr[0];
        int mid;

        // what if target element is greater than all elements in array
        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;

    }
}
