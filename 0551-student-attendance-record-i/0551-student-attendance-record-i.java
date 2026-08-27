class Solution {
    public boolean checkRecord(String s) {
        int absent=0,late=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='A') absent+=1;
            if(ch=='L') late+=1;
            else{
                late=0;
            }

            if(late==3 || absent>=2){
                return false;
            }
        }

        return true;

    }
}