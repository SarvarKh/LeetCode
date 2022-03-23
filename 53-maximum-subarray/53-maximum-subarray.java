class Solution {
    public int maxSubArray(int[] nums) {
//         int currMax = nums[0];
//         int actMax = nums[0];
        
//         for(int i = 0; i < nums.length - 1; i++) {
//             if (currMax > nums[i+1]) {
//                 if(currMax < currMax + nums[i+1]) {
//                     actMax = currMax + nums[i+1];
//                 }
//                 currMax += nums[i+1];
//             } else {
//                 currMax = nums[i+1];
//             }
//         }
//         return actMax;
        
        int local = 0;
        int global = -10000;
        
        for(int i = 0; i < nums.length; i++) {
            local = Math.max(nums[i], local+nums[i]);
            if (local > global) {
                global = local;
            }
        }
        return global;
    }
}