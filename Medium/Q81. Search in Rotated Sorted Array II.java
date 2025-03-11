class Solution {
    public boolean search(int[] nums, int t) {
        int st=0, end = nums.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==t) return true;
            if(nums[mid]==nums[end]) end--;
            else if(nums[mid]<nums[end]){
                if(t<=nums[end] && t>nums[mid]) st = mid+1;
                else end = mid-1;
            }
            else{
                if(t>=nums[st] && t< nums[mid]) end = mid-1;
                else st = mid+1;
            }
        }
        return false;
    }
}