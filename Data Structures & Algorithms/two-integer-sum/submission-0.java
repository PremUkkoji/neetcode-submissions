class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            mp.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++) {
            if(mp.containsKey(target - nums[i]) && mp.get(target - nums[i]) != i) {
                int j = mp.get(target - nums[i]);
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }
        }
        return new int[0];
    }
}
