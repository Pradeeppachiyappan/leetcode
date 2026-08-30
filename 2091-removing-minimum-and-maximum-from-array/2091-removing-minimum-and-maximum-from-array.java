class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;

        if(n==1) return 1;

        int maxInd=0,minInd=0;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxInd]){
                maxInd=i;
            }
            if(nums[i]<nums[minInd]){
                minInd=i;
            } 
        }

        int fromFront=Math.max(minInd,maxInd)+1;
        int fromBack=n-Math.min(minInd,maxInd);

        int both=Math.min(minInd+1+(n-maxInd),maxInd+1+(n-minInd));
        return Math.min(fromFront,Math.min(fromBack,both));
    }
}