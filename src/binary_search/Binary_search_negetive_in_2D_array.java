package binary_search;

public class Binary_search_negetive_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        System.out.println((search(arr)));
    }

    static int search(int[][] matrix) {
        int row = 0;
        int column = matrix.length;
        int target = 0;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] >= 0) {
                row++;
            } else if (matrix[row][column] < 0) {
                target += matrix.length - row;
                column--;


            }



        }
        return target;
    }
}

