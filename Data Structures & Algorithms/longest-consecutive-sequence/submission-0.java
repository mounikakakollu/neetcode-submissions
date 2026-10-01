class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> sequenceLen = new HashMap<>();
        int longestConsecutiveLen = 0;
    
        for (int num : nums) {

            if (sequenceLen.containsKey(num)) {
                continue;
            }

            sequenceLen.put(num, sequenceLen.getOrDefault(num-1, 0) + sequenceLen.getOrDefault(num+1,0) + 1);

            sequenceLen.put(num + sequenceLen.getOrDefault(num+1, 0), sequenceLen.getOrDefault(num,0));

            sequenceLen.put(num - sequenceLen.getOrDefault(num-1, 0), sequenceLen.getOrDefault(num,0));

            longestConsecutiveLen = longestConsecutiveLen < sequenceLen.get(num) ? sequenceLen.get(num) : longestConsecutiveLen;


            
        }
        return longestConsecutiveLen;
    }
    
}
