class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 1,n=nums.length;
        if(n==1) return nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) count++;
            else{
                if(count==1) return nums[i];
                count = 1;
            }
        }
        return nums[n-1];
    }
}