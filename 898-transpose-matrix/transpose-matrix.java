class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] arr = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}