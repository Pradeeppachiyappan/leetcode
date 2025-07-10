class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });

        List<Integer> list=new ArrayList<>();

        for(int arr[]:envelopes){
            int h=arr[1];
            int ind=Collections.binarySearch(list,h);
            if(ind<0){
                ind=-(ind+1);
            }
            if(list.size()==ind){
                list.add(h);
            }
            else{
                list.set(ind,h);
            }
        }
        return list.size();
    }
}