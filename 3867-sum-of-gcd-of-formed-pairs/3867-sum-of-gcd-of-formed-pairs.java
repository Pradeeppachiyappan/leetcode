class Solution {
    private static int findGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
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