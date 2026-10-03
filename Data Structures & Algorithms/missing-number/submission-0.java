class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNaturalNums = n*(n+1)/2;
        int listTotal = 0;
        for (int num : nums) {
            listTotal+=num;
        }
        return sumOfNaturalNums-listTotal;
        
    }
}
