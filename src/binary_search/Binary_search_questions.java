package binary_search;

public class Binary_search_questions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,17,28};
        int target = 14;
        System.out.println(Binary_search(arr, target));
    }
    static int Binary_search(int[] arr, int target){
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
        return start;

    }

}
