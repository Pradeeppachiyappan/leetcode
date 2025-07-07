class Solution {
    public int minPatches(int[] nums, int n) {
        long miss=1;
        int ind=0,patch=0;

        while(miss<=n){
            if(ind<nums.length && nums[ind]<=miss){
                miss+=nums[ind];
                ind++;
            }
            else{
                patch++;
                miss=2*miss;
            }
        }

        return patch;
    }
}