package binary_search;

public class Binary_search_search_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(findpivot(arr));

    }

    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot == -1){
            return binary_search(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target > nums[0]){
            return binary_search(nums, target, 0, pivot - 1);
        }
        return binary_search(nums, target, 0, pivot + 1);
    }

    static int binary_search(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid == target){
                return mid;
            }
            if(mid < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

     static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
