class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length; i++) {
            int[] sub_arr = matrix[i];
            if (sub_arr[sub_arr.length-1] >= target) {
                for (int j=0; j<sub_arr.length; j++) {
                    if (sub_arr[j] == target) return true;
                }
            }
        }
        return false;
    }
}