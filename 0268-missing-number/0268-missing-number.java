class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ind=0;
        int miss=0;
        while(ind!=-1){
            if(ind==nums.length){
                return ind;
            }
            if(nums[ind]==miss){
                miss++;
                ind++;
            }
            else{
                return miss;
            }
        }
        return -1;
    }
}