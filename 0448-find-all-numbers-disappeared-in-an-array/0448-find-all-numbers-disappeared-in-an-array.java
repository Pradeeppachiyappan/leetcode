class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> arr=new HashSet<Integer>();
        List<Integer> list=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!(arr.contains(i)))
            {
                list.add(i);
            }
        }
        return list;
    }
}