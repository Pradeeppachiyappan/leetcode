class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longest="";

        for(String word:dictionary){
            int longLen=longest.length();
            int wordLen=word.length();

            if(wordLen<longLen || wordLen==longLen && word.compareTo(longest)>0){
                continue;
            }

            int lpos=-1;
            for(int i=0;i<wordLen;i++){
                lpos=s.indexOf(word.charAt(i),lpos+1);
                if(lpos==-1){
                    break;
                }
            }
            if(lpos!=-1){
                longest=word;
            }

        }

        return longest;
    }
}