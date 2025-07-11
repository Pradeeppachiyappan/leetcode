class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder rev=new StringBuilder(s);
        String revStr=rev.reverse().toString();
        for(int i=0;i<s.length();i++){
            if(s.startsWith(revStr.substring(i))){
                return revStr.substring(0,i)+s;
            }
        }
        
        return "";
    }
}