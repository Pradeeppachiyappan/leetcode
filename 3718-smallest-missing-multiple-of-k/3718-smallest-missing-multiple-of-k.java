class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int multi=1;
        while(multi<=101){
            if(!set.contains(multi*k)){
                return multi*k;
            }
            multi++;
        }

        return 0;
    }
}