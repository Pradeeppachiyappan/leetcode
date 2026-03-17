class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;

        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<m;i++){
            int st=0,ed=m-1;
            while(st<ed){
                int temp=matrix[i][st];
                matrix[i][st]=matrix[i][ed];
                matrix[i][ed]=temp;
                st++;
                ed--;
            }
        }

    }
}