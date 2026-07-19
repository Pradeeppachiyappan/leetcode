class Solution {

    private int findGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int findGCD(int[] nums) {
        int min=1001;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
            if(max<nums[i]) max=nums[i];
        }

        return findGCD(min,max);
    }
}