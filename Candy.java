class Solution {
    public int candy(int[] ratings) {
       int ans=0;
       int n=ratings.length;
       int[] candy=new int[n];
       for(int i=n-1;i>0;i--){
           if(ratings[i-1]>ratings[i]) candy[i-1]=candy[i]+1;
       }
       for(int i=0;i<n-1;i++){
           if(ratings[i]<ratings[i+1]&& candy[i]>=candy[i+1])candy[i+1]=candy[i]+1;
            ans+=candy[i];
       } 
    return n+ans+candy[n-1];
    }
}
