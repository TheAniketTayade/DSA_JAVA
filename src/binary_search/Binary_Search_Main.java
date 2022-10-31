package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary_Search_Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(arr, target));

    }
    static List<Integer> targetIndices(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        List ans = null;
        Arrays.sort(nums);
        List<Integer> ans_list = new ArrayList<>();

        while (start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans_list.add(i);
            }
        }

        return ans_list;
    }
}
