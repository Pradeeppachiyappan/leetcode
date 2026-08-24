class Solution {
    public int checkrev(int n){
        int sum=0;
        while(n!=0){
            sum=sum*10+(n%10);
            n/=10;
        }

        return sum;
        
    }
    public boolean checkSum(int n){
        int old=n;
        int sum1=1,sum2=0;

        while(n!=0){
            int rev=n%10;
            sum1=sum1*rev;
            sum2=sum2+rev;
            n/=10;
        }

        int tot=sum1+sum2;
        
        return old%tot==0;
    }
    public boolean checkDivisibility(int n) {
        return checkSum(n);
    }
}