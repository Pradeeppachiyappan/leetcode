class Solution {
    public int missingNumber(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num:nums){
            queue.add(num);
        }
        int miss=0;
        while(!queue.isEmpty()){
            if(miss!=queue.poll()){
                return miss;
            }
            miss++;
        }

        return miss;
    }
}