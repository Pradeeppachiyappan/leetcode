class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        for(char i='a';i<='z';i++){
            int lower=word.lastIndexOf(i);
            int upper=word.indexOf(Character.toUpperCase(i));
            if(lower!=-1&&upper!=-1&&lower<upper)cnt++;
        }
        return cnt;
    }
}