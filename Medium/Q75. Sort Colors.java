class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]) min=j;
            }
            if(i!=min){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }
}