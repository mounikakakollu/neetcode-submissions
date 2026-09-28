class Solution {

    
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> frequencyArray = new ArrayList<List<Integer>>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            if (frequencyMap.get(num) == null) {
                frequencyMap.put(num, 0);
            }
            frequencyMap.put(num, frequencyMap.get(num) + 1);
            frequencyArray.add(new ArrayList<Integer>());
            i++;
        }
        frequencyArray.add(new ArrayList<Integer>());
         
        for (int num : frequencyMap.keySet()) {
            frequencyArray.get(frequencyMap.get(num)).add(num);
        }
        int[] result = new int[k];
        int j = 0;
        for (i = nums.length; i>=0 && j<k ; i--) {
            for (int num : frequencyArray.get(i)) {
                if (j>=k) {
                    return result;
                }
                result[j] = num;
                j++;
            }
        }
        return result;
        
    }
}
