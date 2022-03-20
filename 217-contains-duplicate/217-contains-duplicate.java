import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicatedNumber = new HashMap<Integer, Integer>();
            
        for (int i = 0; i < nums.length; i++) {
            if (duplicatedNumber.get(nums[i]) == null) {
                duplicatedNumber.put(nums[i], nums[i]);
            } else {
                return true;
            }
        }
        
        return false;
    }
}