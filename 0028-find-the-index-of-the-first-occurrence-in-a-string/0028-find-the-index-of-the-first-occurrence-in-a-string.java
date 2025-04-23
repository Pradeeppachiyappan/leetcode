class Solution {
    public int strStr(String haystack, String needle){
        int ind;
        for(ind=0;ind<haystack.length()-needle.length()+1;ind++){
            char ch=haystack.charAt(ind);
            if(ch==needle.charAt(0)){
                if(haystack.substring(ind,needle.length()+ind).equals(needle)){
                    return ind;
                }
            }
        }   
        return -1;
    }
}