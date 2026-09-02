class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;

        int o=0,e=0;

        for(int num:nums1){
            if(num%2==0) e++;
            else o++;
        }

        boolean even=true;

        for(int num:nums1){
            if(num%2!=0 && e<2){
                even=false;
                break;
            }
        }

        boolean odd=true;

        if(o==0) odd=false;
        else{
            for(int num:nums1){
                if(num%2==0 && o==0){
                    odd=false;
                    break;
                }
            }
        }

        return odd || even;
    }
}