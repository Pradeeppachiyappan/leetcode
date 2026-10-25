class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list=new ArrayList<>();
        int small=0,equal=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                equal++;
            }

            if(nums[i]<target) small++;
        }

        for(int i=small;i<small+equal;i++){
            list.add(i);
        }

        return list;
    }
}