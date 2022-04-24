class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char m = s.charAt(i);
            char r = t.charAt(i);
            sMap.put(r, sMap.getOrDefault(r, 0) +1);
            tMap.put(m, tMap.getOrDefault(m, 0) +1);
        }
        
        for (Character c : sMap.keySet()) {
            if(sMap.get(c) > tMap.getOrDefault(c, -1)) return false;
        }
        
        return true;
    }
}