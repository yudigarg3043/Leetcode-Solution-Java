class Solution {
    public int search(int[] nums, int t) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==t) return mid;
            if(nums[st]<=nums[mid]){
                if(t>=nums[st] && t<nums[mid]) end=mid-1;
                else st=mid+1;
            }
            else{
                if(t>nums[mid] && t<=nums[end]) st = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}