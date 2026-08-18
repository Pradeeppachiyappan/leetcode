class Solution {

    public int largestInteger(int[] nums, int k) {
        int n=nums.length;

        if(k==1){
            int[] freq=new int[51];

            for(int num:nums) freq[num]++;

            int large=-1;
            for(int num:nums){
                if(num>large && freq[num]==1) large=num;
            }

            return large;
        }

        if(k==n){
            int large=-1;
            for(int num:nums){
                if(num>large) large=num;
            }

            return large;
        }

        int[] freq=new int[51];

        for(int num:nums) freq[num]++;

        if(freq[nums[0]]==1 && (freq[nums[n-1]]>1 || nums[0]>nums[n-1])) return nums[0];
        if(freq[nums[n-1]]==1) return nums[n-1];

        return -1;
    }
}