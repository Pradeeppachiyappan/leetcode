class Solution {
    public boolean hasMatch(String s, String p) {
        int ind=p.indexOf("*");
        String prefix=p.substring(0,ind),suffix=p.substring(ind+1);
        int preInd=s.indexOf(prefix);
        int sufInd=s.indexOf(suffix,preInd+ind);

        return preInd>-1 && sufInd>-1;
    }
}