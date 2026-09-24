class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        if (s.length()!=t.length()) {
            return false;
        }
        for (int i=0; i<26; i++) {
            chars[i] = 0;
        }

        for (int i = 0; i<s.length(); i++) {
            chars[s.charAt(i)-97]++;
            chars[t.charAt(i)-97]--;
        }

        for (int i=0; i<26; i++) {
            if (chars[i] != 0) {
                return false;
            }
        }
        return true;



    }
}
