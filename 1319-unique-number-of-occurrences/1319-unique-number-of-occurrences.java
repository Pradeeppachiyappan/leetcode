class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashmap=new HashMap();

        for(int num:arr){
            hashmap.put(num, hashmap.getOrDefault(num, 0)+1);
        }

        HashSet<Integer> set=new HashSet(hashmap.values());
        return hashmap.size()==set.size();

    }
}