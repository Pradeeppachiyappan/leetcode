class Solution {
    public int reverseDegree(String s) {
        int degree=0;

        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'a';
            degree+=(i+1)*(26-num);
        }

        return degree;
    }
}