class Solution {
    public long sumAndMultiply(int n) {
        int sum=0,x=0;
        String str=String.valueOf(n);

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='1' && ch<='9'){
                sum+= ch-'0';
                x=x*10+(ch-'0');  
            }
        }

        return (long)x*sum;
    }
}