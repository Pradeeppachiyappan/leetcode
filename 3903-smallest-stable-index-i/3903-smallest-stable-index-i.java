class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0, ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            map.put(i,min);
        }
        
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(max-map.get(i)<=k){
                return i;
            }
        }

        return -1;
    }
}