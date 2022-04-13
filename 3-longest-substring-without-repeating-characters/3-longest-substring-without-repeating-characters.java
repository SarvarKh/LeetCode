import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int right = 0, left = 0, max = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                ++left;
            }
            set.add(c);
            max = Math.max(max, right-left+1);
            ++right;
        }
        return max;
    }
}