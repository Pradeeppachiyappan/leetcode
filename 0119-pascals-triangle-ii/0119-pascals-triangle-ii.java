class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList<>();
        int i;
        for(i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);

                }
                else{
                    List<Integer> PreviousRow = pascal.get(i-1);
                    row.add(PreviousRow.get(j)+PreviousRow.get(j-1));
                }
            }
            pascal.add(row);
        }
        List<Integer> list=pascal.get(pascal.size()-1);
        return list;
    }
}