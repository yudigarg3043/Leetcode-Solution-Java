class Solution {
    public boolean isIsomorphic(String a, String b) {
        if(a.length()!=b.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i))){
                if(map.get(a.charAt(i))!=b.charAt(i)) return false;
            }
            else if(set.contains(b.charAt(i))) return false;
            else{
                map.put(a.charAt(i), b.charAt(i));
                set.add(b.charAt(i));
            }
        }
        return true;
    }
}