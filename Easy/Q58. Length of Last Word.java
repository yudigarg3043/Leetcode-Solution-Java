import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer str = new StringTokenizer(s);
        String st = null;
        while(str.hasMoreTokens()) st=str.nextToken();
        return st.length();
    }
}