class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0, count=0;
        for(int i: nums){
            if(i==1) count++;
            else{
                a = Math.max(a,count);
                count=0;
            }
        }
        a = Math.max(a,count);
        return a;
    }
}