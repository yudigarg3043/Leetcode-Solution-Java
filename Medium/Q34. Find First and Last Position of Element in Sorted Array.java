class Solution {
    static int First(int[] arr, int t){
        int st=0, end=arr.length-1, ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==t){
                ans = mid;
                end=mid-1;
            }
            else if(t<arr[mid]) end=mid-1;
            else st=mid+1;
        }
        return ans;
    }
    static int Last(int[] arr, int t){
        int st=0, end=arr.length-1, ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==t){
                ans = mid;
                st = mid+1;
            }
            else if(t<arr[mid]) end = mid-1;
            else st=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = First(nums, target);
        arr[1] = Last(nums,target);
        return arr;
    }
}
