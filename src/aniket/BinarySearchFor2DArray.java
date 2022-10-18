package aniket;

import java.util.Arrays;
public class BinarySearchFor2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search (int[][] matrix, int target){
        int row = 0;
        int column = matrix.length;
        while (row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[] {row, column};
            }
            if (matrix[row][column] < target){
                row++;
            }
            else {
                column--;
            }
        }
        return new int[] {-1, -1};
    }
}
