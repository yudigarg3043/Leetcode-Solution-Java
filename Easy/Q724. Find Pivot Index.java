class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int t=0;
        for(int i:nums){
            t+=i;
        }
        int l=0;
        for(int i=0;i<n;i++){
            if(l==t-l-nums[i]){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}