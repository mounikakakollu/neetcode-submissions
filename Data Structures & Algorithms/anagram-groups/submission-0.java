class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> hashAnagrams = new HashMap<List<Integer>, List<String>>();

        for (String s : strs) {
            List<Integer> tmp = new ArrayList<>(26);
            for (int i = 0; i < 26; i++) {
                tmp.add(0);
            }

            for (int j = 0; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                tmp.set(index, tmp.get(index)+1);
            }

            if (hashAnagrams.get(tmp) == null) {
                hashAnagrams.put(tmp, new ArrayList<String>());
            }
            hashAnagrams.get(tmp).add(s);
        }
        return new ArrayList<>(hashAnagrams.values());
    }
}
