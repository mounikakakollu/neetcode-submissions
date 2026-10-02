class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack[top] = s.charAt(i);
                top++;
            } else if(top == 0) {
                return false;
            } else if(s.charAt(i) == ']' && stack[top-1] != '[') {
                return false;
            } else if(s.charAt(i) == '}' && stack[top-1] != '{') {
                return false;
            } else if (s.charAt(i) == ')' && stack[top-1] != '(') {
                return false;
            } else {
                top--;
            }
        }
        if (top == 0) {
            return true;
        }
        return false;
        
    }
}
