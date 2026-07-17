class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] aux = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            aux[i] = matrix[i].clone();
        }
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                matrix[i][j] = aux[size-j-1][i];
            }
        }
    }
}