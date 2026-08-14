class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];

        int maxLength=0,left=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';

            freq[ch]++;

            while(freq[ch]>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }

            maxLength=Math.max(maxLength,i-left+1);
        }

        return maxLength;
    }
}