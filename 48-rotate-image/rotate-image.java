class Solution {
    public void rotate(int[][] matrix) {
        int R = matrix.length;
        int top = 0, bottom = R - 1;
        while (top < bottom) 
        {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
        for (int i = 0; i < R; i++) 
        {
            for (int j = i + 1; j < R; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < R; i++) 
        {
            for (int j = 0; j < R; j++) 
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}