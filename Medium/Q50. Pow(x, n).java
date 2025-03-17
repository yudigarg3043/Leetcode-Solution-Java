class Solution {
    public double myPow(double x, long n) {
        if(n==0) return 1.0;
        long power = n;
        if(n<0){
            x=1/x;
            power=-power;
        }
        double half = myPow(x,power/2);
        if(power%2==0) return half*half;
        else return half*half*x;
    }
}