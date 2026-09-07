class Solution {
    public void loop(int[] arr,int tar,int ind,List<List<Integer>> llist,List<Integer> list){
        if(tar<0){
            return;
        }

        if(tar==0){
            llist.add(new ArrayList<>(list));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            list.add(arr[i]);
            loop(arr, tar-arr[i],i,llist,list);
            list.remove(list.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> llist=new ArrayList<>();
        loop(candidates,target,0,llist,new ArrayList<>());
        return llist;
    }
}