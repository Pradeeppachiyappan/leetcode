class Solution {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n=nums.length;

        int max=0;

        int[] gcds=new int[n];

        for(int i=0;i<n;i++){
            if(max<nums[i]) max=nums[i];
            gcds[i]=findGCD(nums[i],max);
        }

        Arrays.sort(gcds);

        int left=0,right=n-1;

        long sum=0;
        while(left<right){
            sum+=findGCD(gcds[left],gcds[right]);
            left++;
            right--;
        }

        return sum;

    }
}