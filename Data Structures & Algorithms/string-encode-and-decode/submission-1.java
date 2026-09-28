class Solution {

    public String encode(List<String> strs) {

        String encodedStr = "";
        String delimiter = "*";
        for (String s : strs) {
            encodedStr += s.length() + delimiter + s;
        }
        return encodedStr;

    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList<String>();
        for (int i = 0; i<str.length(); i++) {
            String lenStr = "";
            int len = 0;
            String tmp = "";
            if (Character.isDigit(str.charAt(i))) {
                while(i<str.length() && str.charAt(i) != '*') {
                    lenStr+=str.charAt(i);
                    i++;
                }
                len = Integer.parseInt(lenStr);
                int j=1;
                for(j=1; j<=len; j++){
                    tmp+=str.charAt(i+j);
                    
                }
                
                decodedStrs.add(tmp);
                i = i+j-1;

            }
        }
        
        return decodedStrs;

    }
}
