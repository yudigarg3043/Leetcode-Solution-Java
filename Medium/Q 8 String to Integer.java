class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int sign=1,i=0,l = s.length();
        long num=0;
        if(s.isEmpty()) return 0;
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i<l && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && digit>7)){
                return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return (int)(num*sign);
    }
}