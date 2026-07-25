class Solution {
    public int maxProduct(int n) {
        int max=0,secMax=0;

        while(n!=0){
            int rem=n%10;
            if(rem>max){
                secMax=max;
                max=rem;
            }
            else if(rem>secMax && rem<=max){
                secMax=rem;
            }
            n=n/10;
        }

        return max*secMax;
    }
}