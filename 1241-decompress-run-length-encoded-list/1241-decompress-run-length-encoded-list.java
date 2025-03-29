class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int freq,val;
        for(int i=0;i<nums.length-1;i+=2){
            freq=nums[i];
            val=nums[i+1];
            for(int j=1;j<=freq;j++){
                list.add(val);
            }
        }
        int[] arr=new int[list.size()];
        int ind=0;
        for(int num:list){
            arr[ind]=num;
            ind++;
        }
        return arr;
    }
}