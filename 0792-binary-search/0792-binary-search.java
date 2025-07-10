class Solution {
    public int search(int[] nums, int target) {
        int ind=Arrays.binarySearch(nums,target);
        if(ind>-1) return ind;
        return -1;
    }
}