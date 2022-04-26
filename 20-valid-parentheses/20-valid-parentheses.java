class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0) return false;
        ArrayList<Character> stack = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            
            if (stack.size() == 0) {
                stack.add(s.charAt(i));
                continue;
            }
            
            int lastCharInd = stack.size() - 1;
            char lastChar = stack.get(lastCharInd);
            
            
            if (lastChar == '(' && current == ')') {
                stack.remove(lastCharInd);
            } else if (lastChar == '{' && current == '}') {
                stack.remove(lastCharInd);
            } else if (lastChar == '[' && current == ']') {
                stack.remove(lastCharInd);
            } else {
                stack.add(current);
            }
        }
        
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}