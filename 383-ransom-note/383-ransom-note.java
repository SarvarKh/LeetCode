class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        
        HashMap<Character, Integer> ranMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();
        
        for (int i=0; i<magazine.length(); i++) {
            char m = magazine.charAt(i);
            if (i < ransomNote.length()) {
                char r = ransomNote.charAt(i);
                ranMap.put(r, ranMap.getOrDefault(r, 0) +1);
            }
            
            magMap.put(m, magMap.getOrDefault(m, 0) +1);
        }
        
        for (Character c : ranMap.keySet()) {
            if(ranMap.get(c) > magMap.getOrDefault(c, -1)) return false;
        }
        
        return true;
    }
}