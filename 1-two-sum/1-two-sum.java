class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = 1;
        int[] res = {0, 1};
        
        while (r < nums.length) {
            if (nums[l] + nums[r] == target) {
                res[0] = l;
                res[1] = r;
                return res;
            }
            r++;
            if (r == nums.length) {
                l++;
                r = l + 1;
            }
        }
        return res;
    }
}