class Solution {

    private int findLessFrequentIndex(int[] topK, Map<Integer, Integer> frequencyMap) {
        int lessFrequentIndex = 0;
        for (int i = 0; i<topK.length; i++) {
            if (frequencyMap.get(topK[lessFrequentIndex]) > frequencyMap.get(topK[i])) {
                lessFrequentIndex = i;
            }
        }
        return lessFrequentIndex;
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        int[] topK = new int[k];
        int i = 0;
        int lessFrequentIndex = 0;
        for (int num : frequencyMap.keySet()) {
            if (i<k) {
                topK[i] = num;
                if (frequencyMap.get(num) < frequencyMap.get(topK[lessFrequentIndex])) {
                    lessFrequentIndex = i;
                }
                i++;
            } else if (frequencyMap.get(num) > frequencyMap.get(topK[lessFrequentIndex])) {
                topK[lessFrequentIndex] = num;
                lessFrequentIndex = findLessFrequentIndex(topK, frequencyMap);
            }
        }
        return topK;
        
    }
}
