class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][] tra=new int[m][n];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                tra[j][i]=matrix[i][j];
            }
        }   
        return tra;
    }
}