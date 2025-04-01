class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;

        for(long a : nums){
            if(a>max1){
                max3=max2;
                max2=max1;
                max1=a;
            }
            else if(a>max2 && a!=max1){
                max3=max2;
                max2=a;
            }
            else if(a>max3 && a!=max1 && a!=max2){
                max3=a;
            }
        }

        return (max3 == Long.MIN_VALUE) ? (int) max1 : (int) max3;
    }
}