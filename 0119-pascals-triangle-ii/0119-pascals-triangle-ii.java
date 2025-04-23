class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascal=new ArrayList<>();
        int i;
        for(i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);

                }
                else{
                    int sum = pascal.get(j-1) + pascal.get(j);
                    row.add(sum);
                }
            }
            pascal=row;
        }
        return pascal;
    }
}