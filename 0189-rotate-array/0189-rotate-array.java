class Solution {
    public void rotArr(int[] nums,int k,int length){
        int[] newArr=new int[length];
        int ind=0,n=length-k;

        for(int i=n;i<length;i++){
            newArr[ind]=nums[i];
            ind++;
        }

        for(int i=0;i<n;i++){
            newArr[ind]=nums[i];
            ind++;
        }

        for(int i=0;i<length;i++){
            nums[i]=newArr[i];
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n) k=k%n;
        if(k==0 && k==n) return;
        rotArr(nums,k,n);
    }
}