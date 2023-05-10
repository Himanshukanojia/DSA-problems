class Solution {
    public int[][] generateMatrix(int n) {
       int ans[][] = new int[n][n];
       int count=1;
       int top=0,left=0,bottom=n-1,right=n-1;
       while(left<=right && top<=bottom){
           for(int i=left;i<=right;i++) ans[top][i] = count++;
           top++;
           for( int i=top;i<=bottom;i++) ans[i][right] = count++;
           right--;
           if(top<=bottom){
               for(int i=right;i>=left;i--) ans[bottom][i] = count++;
               bottom--;
           }
           if(left<=right){
               for(int i=bottom;i>=top;i--) ans[i][left] = count++;
               left++;
           }
           
       }
       return ans;
       }
}
