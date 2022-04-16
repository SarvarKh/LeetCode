class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            int count = map.getOrDefault(j, 0);
            if (count > 0) {
                list.add(j);
                map.put(j, count - 1);
            }
        }
        
        int[] result = new int[list.size()];
        int i = 0;
        for (int num : list) {
            result[i++] = num;
        }
        
        return result;
    }
}