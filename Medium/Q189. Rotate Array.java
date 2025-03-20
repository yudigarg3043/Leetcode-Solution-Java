class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n];
        k = k%n;
        for(int i=0;i<n;i++){
            r[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = r[i];
        }
    }
}