class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] front=new int[n];
        int[] end=new int[n];
        int[] result=new int[n];

        front[0]=1;
        for(int i=1;i<n;i++){
            front[i]=front[i-1]*nums[i-1];
        }

        end[n-1]=1;
        for(int i=n-2;i>=0;i--){
            end[i]=end[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            result[i]=front[i]*end[i];
        }

        return result;
    }

}