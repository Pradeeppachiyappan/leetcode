class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0,sum=0;
        int left=0,right;

        for(right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum*(right-left+1)>=k){
                sum=sum-nums[left];
                left++;
            }

            count=count+(right-left+1);
        }

        return count;
    }
}