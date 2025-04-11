class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0, windowSum=0;
        for(int i=0;i<k;i++) windowSum += nums[i];
        max = windowSum;
        for(int i=k; i<nums.length;i++){
            windowSum += nums[i] - nums[i-k];
            max = Math.max(max, windowSum);
        }

        return (double)max / k;
    }
}