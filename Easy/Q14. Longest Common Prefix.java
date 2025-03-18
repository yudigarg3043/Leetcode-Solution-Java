class Solution {
    public String longestCommonPrefix(String[] str) {
        int n = str.length,j=0;
        StringBuilder st = new StringBuilder();
        while(j<str[0].length()){
            char a = str[0].charAt(j);
            for(int i=0;i<n;i++){
                if(j>=str[i].length() || str[i].charAt(j)!=a) return st.toString();
            }
            st.append(a);
            j++;
        }
        return st.toString();
    }
}