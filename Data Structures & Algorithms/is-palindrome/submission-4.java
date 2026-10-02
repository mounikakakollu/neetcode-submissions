class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length()-1, i=0;
        while(i<=j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                return false;
            }
            i++;
            j--;
        }
        return true;

        
    }
}
