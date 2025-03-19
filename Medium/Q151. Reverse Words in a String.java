class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        String[] words1 = new String[n];
        for(int i=0;i<n;i++){
            words1[i] = words[n-i-1];
        }
        return String.join(" ",words1);
    }
}