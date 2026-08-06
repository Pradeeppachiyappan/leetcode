class Solution {
    public boolean check(int num,int k){
        int product=1;

        while(num!=0){
            product*=(num%10);
            num/=10;
        }

        return product%k==0;
    }

    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            if(check(i,t)) return i;
        }

        return 0;
    }
}