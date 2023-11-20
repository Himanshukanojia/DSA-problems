class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
    int p=0, m=0, g=0, ans=0;
    for(int i=0; i<garbage.length; i++){
        for(char ch : garbage[i].toCharArray()){
            if(ch=='P') p = i;
            else if(ch=='M') m = i;
            else if(ch=='G') g = i;
            ans++;                         // add 1 min for every pick-up
        }
    }
    
    for(int i=1; i<travel.length; i++)
        travel[i] = travel[i]+travel[i-1];
    
    if(p!=0) ans += travel[p-1];           // travel time till last P
    if(m!=0) ans += travel[m-1];          // travel time till last M
    if(g!=0) ans += travel[g-1];           // travel time till last G
    return ans;
    }
}
