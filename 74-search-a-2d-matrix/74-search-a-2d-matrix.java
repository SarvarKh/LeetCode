class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows*cols - 1;
        
        while(left <= right) {
            int midpoint = left + (right-left)/2;
            int midpoint_el = matrix[midpoint/cols][midpoint%cols];
            
            if(midpoint_el == target) {
                return true;
            } else if(target < midpoint_el) {
                right = midpoint-1;
            } else if(target > midpoint_el) {
                left = midpoint+1;
            }
        }
        
        return false;
    }
}