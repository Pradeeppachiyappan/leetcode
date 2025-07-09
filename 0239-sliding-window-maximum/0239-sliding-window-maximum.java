class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        int x=0;

        Deque<Integer> deq=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty() && nums[deq.peekLast()]<=nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
                result[x++]=nums[deq.peekFirst()];
            }

        }
        return result;
    }
}