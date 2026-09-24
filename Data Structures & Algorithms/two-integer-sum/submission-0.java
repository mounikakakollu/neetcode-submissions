class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++) {
            targetMap.put(target-nums[i], i);
        }

        for (int i = 0; i<nums.length; i++) {
            if (targetMap.get(nums[i])!=null && targetMap.get(nums[i])!=i) {
                if (targetMap.get(nums[i]) < i) {
                    return new int[]{targetMap.get(nums[i]), i};
                } 
                return new int[]{i, targetMap.get(nums[i])};
            }
        } 
        return new int[]{0,0};
    }
}
