class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length, n= a[0].length, st=0,end=m*n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int mid1 = a[mid/n][mid%n];
            if(target==mid1){
                return true;
            }
            else if(target<mid1){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
}