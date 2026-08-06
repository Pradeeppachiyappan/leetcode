class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int[] freq=new int[101];

        int start=101,end=0;

        for(int num:nums){
            freq[num]++;
            if(num<start) start=num;
            if(num>end) end=num;
        }

        List<Integer> list=new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(freq[i]==0) list.add(i);
        }

        return list;
    }
}