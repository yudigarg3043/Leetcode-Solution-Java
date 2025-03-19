class Solution {
    public int findMin(int[] nums) {
        int st=0, end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]<nums[end]) end=mid;
            else st = mid+1;
        }
        return nums[st];
    }
}