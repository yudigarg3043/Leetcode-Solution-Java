class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        Set<Integer> set = new HashSet<>();
        int m=nums1.length, n=nums2.length;
        if(m>n){
            for(int i=0;i<m;i++){
                arr[nums1[i]]=-1;
            }
            for(int i=0;i<n;i++){
                if(arr[nums2[i]]==-1) set.add(nums2[i]);
            }
        }
        else{
            for(int i=0;i<n;i++){
                arr[nums2[i]]=-1;
            }
            for(int i=0;i<m;i++){
                if(arr[nums1[i]]==-1) set.add(nums1[i]);
            }
        }
        int[] arr1 = new int[set.size()];
        int i=0;
        for(int a:set){
            arr1[i++] = a;
        }
        return arr1;
    }
}