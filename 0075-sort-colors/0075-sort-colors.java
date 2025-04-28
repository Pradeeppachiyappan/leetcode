class Solution {
    void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        int i=0;

        while(i<=right){
            if(nums[i]==0){
                swap(i,left,nums);
                left++;
            }
            else if(nums[i]==2){
                swap(i,right,nums);
                right--;
                i--;
            }
            i++;
        }
    }
}