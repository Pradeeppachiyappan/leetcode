class Solution {
    int max = 0;
    int mat[][];

    public int sol(int[][] arr, int left, int right, int pre) {
        if (left < 0 || right < 0 || left >= arr.length || right >= arr[0].length || arr[left][right] <= pre)
            return 0;

        if (mat[left][right] != 0) return mat[left][right]; // \U0001f9e0 Memoization

        int val = arr[left][right];

        int up = sol(arr, left - 1, right, val);
        int down = sol(arr, left + 1, right, val);
        int leftSide = sol(arr, left, right - 1, val);
        int rightSide = sol(arr, left, right + 1, val);

        int p = 1 + Math.max(Math.max(up, down), Math.max(leftSide, rightSide));
        mat[left][right] = p;

        return p;
    }

    public int longestIncreasingPath(int[][] matrix) {
        mat = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, sol(matrix, i, j, -1));
            }
        }
        return max;
    }
}