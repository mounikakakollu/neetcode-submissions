class Solution {
    public int maxArea(int[] heights) {
        int maxCapacity = 0;

        int i = 0, j = heights.length-1;
        while(i<j) {
            int currCapacity = (j-i) * Math.min(heights[i], heights[j]);
            if (currCapacity > maxCapacity) {
                maxCapacity = currCapacity;
            }

            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxCapacity;
        
    }
}
