class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();

        int[] freq=new int[26];

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        char[] arr=new char[n];

        int left=0;
        int right=n-1;

        for(int i=0;i<26;i++){

            while(freq[i]>=2){
                arr[left++]=(char)('a'+i);
                arr[right--]=(char)('a'+i);
                freq[i]-=2;
            }

            if(freq[i]==1){
                arr[n/2]=(char)('a'+ i);
            }
        }

        return new String(arr);
    }
}