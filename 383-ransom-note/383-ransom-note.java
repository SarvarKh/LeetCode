class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        
        HashMap<Character, Integer> magMap = new HashMap<>();
        
        for (int i=0; i<magazine.length(); i++) {
            char m = magazine.charAt(i);    
            magMap.put(m, magMap.getOrDefault(m, 0) +1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if(!magMap.containsKey(c) || magMap.get(c) <= 0) return false;
            
            magMap.put(c, magMap.get(c)-1);
        }
        
        return true;
    }
}