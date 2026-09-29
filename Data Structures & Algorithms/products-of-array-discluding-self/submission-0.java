class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] sufixArray = new int[nums.length];
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i<nums.length; i++) {
            prefixArray[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length-1; i>=0 ; i--) {
            sufixArray[i] = product;
            product*=nums[i];
        }

        for(int i = 0; i<nums.length; i++) {
            result[i] = sufixArray[i] * prefixArray[i];
        }
        return result;
    }
}  
