class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int n =0;
        for(int row = nums.size()-1;row >=0;row--){
            for(int col =0;col < nums.get(row).size();col++){
                int diagonal = row + col;
                if(!map.containsKey(diagonal)) map.put(diagonal,new ArrayList<Integer>());
                map.get(diagonal).add(nums.get(row).get(col));
                n++;
            } 
        }
        int ans[] = new int[n];
        int i =0,curr=0;
        while(map.containsKey(curr)){
            for(int num : map.get(curr)){
                ans[i] = num;
                i++;
            }
            curr++;
        }
        return ans;
    }
}
