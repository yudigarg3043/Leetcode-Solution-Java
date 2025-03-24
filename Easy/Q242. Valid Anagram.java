class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        char[] arr = s.toCharArray();
        char[] ar = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(ar);
        return Arrays.equals(arr,ar);
    }
}