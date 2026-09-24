class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = new char[26];
        for (int i=0; i<26; i++) {
            chars[i] = 0;
        }

        for (int i = 0; i<s.length(); i++) {
            chars[s.charAt(i)-97]+=1;
        }

        for (int i = 0; i<t.length(); i++) {
            chars[t.charAt(i)-97]-=1;
        }

        for (int i=0; i<26; i++) {
            if (chars[i] != 0) {
                return false;
            }
        }
        return true;



    }
}
