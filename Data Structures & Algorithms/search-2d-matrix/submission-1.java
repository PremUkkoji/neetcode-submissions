class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;

        int l = 0, r = n * m - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / m, col = mid % m;
            if (target > matrix[row][col]) {
                l = mid + 1;
            } else if (target < matrix[row][col]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
