class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> ranMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char m = s.charAt(i);
            char r = t.charAt(i);
            ranMap.put(r, ranMap.getOrDefault(r, 0) +1);
            magMap.put(m, magMap.getOrDefault(m, 0) +1);
        }
        
        for (Character c : ranMap.keySet()) {
            if(ranMap.get(c) > magMap.getOrDefault(c, -1)) return false;
        }
        
        return true;
    }
}