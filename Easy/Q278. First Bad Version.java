/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return First(1,n);
    }
    int First(int a, int b){
        if(a==b) return a;
        int mid = a+ (b-a)/2;
        if(isBadVersion(mid)) return First(a,mid);
        else return First(mid+1,b);
    }
}