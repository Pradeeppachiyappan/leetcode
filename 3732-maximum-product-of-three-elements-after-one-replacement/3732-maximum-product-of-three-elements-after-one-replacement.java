class Solution {
    public long maxProduct(int[] nums) {
        long max1=-100001,max2=-100001,min1=0,min2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];

            }
            else if(nums[i]>max2){
                max2=nums[i];
            }

            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2){
                min2=nums[i];
            }
        }

        long possible1=max1*max2*100000L;
        long possible2=min1*min2*100000L;
        long possible3=max1*min1*-100000L;

        long product=Math.max(possible1,Math.max(possible2,possible3));

        return product;
    }
}