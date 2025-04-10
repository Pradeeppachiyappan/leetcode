class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount=0,current=1,ind=0;
        while(missingCount<k){
            if(ind<arr.length && arr[ind]==current){
                ind++;
            }
            else{
                missingCount++;
                if(missingCount==k) return current;
            }
            current++;
        }
        return -1;
    }
}