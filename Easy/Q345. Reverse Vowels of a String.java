class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int r = arr.length-1,l=0;
        while(l<r){
            if(!isVowel(arr[l])) l++;
            else if(!isVowel(arr[r])) r--;
            else{
                char ch = arr[l];
                arr[l] = arr[r];
                arr[r] = ch;
                l++;
                r--;
            }
        }
        String s1 = new String(arr);
        return s1;
    }
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}