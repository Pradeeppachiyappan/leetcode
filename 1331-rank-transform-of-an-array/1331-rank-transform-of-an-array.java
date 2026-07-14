class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();

        Arrays.sort(sorted);

        int m=0;
        for(int x:sorted){
            if(m==0 || sorted[m-1]!=x) sorted[m++]=x;
        }

        int[] uniq=Arrays.copyOf(sorted,m);

        for(int i=0;i<arr.length;i++){
            arr[i]=Arrays.binarySearch(uniq,arr[i])+1;
        }

        return arr;
    }
}