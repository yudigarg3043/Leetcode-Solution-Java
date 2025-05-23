class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row=false, col=false;
        int m=matrix.length, n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(i==0) row=true;;
                    if(j==0) col=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;       
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        if(row){
            for(int j=0;j<n;j++) matrix[0][j]=0;
        }
        if(col){
            for(int i=0;i<m;i++) matrix[i][0]=0;
        }
    }
}