class Solution {
    public int findPeakElement(int[] nums) {
        int st=0,end=nums.length-1;
        while(st<=end){
            if(st==end) return st;
            int mid=st+(end-st)/2;
            if(nums[mid]<nums[mid+1]){
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        return st;
    }
}