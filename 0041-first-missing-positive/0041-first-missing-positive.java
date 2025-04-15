class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing=1;

        for(int num:nums){
            if(num==missing){
                missing++;
            }
            else if(num>missing){
                break;
            }
        }
        
        return missing;
    }
}