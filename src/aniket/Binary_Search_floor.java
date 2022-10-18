package aniket;
// find greatest number smaller than target element

public class Binary_Search_floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        int target = 0;
        System.out.println(floor(arr, target));

    }
    static int floor(int[] arr, int target){
        int end = arr.length - 1;
        int start = arr[0];
        int mid;

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
        return end;

    }
}
