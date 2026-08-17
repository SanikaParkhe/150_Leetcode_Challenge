class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start = 0;
        int end = (rows*cols)-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int row = mid / cols;
            int col = mid % cols;
            if(mat[row][col] == target){
                return true;
            }else if(mat[row][col] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}