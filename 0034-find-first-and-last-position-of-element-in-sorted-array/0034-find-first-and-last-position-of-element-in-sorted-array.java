class Solution {
    public int[] searchRange(int[] nums, int target) {
        int pos1=-1;
        int pos2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                pos1=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                pos2=i;
                break;
            }
        }
        return new int[]{pos1,pos2};
    }
}