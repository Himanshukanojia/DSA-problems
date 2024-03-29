class Solution {
    Map<TreeNode,Integer> map = new HashMap<>();
    public int rob(TreeNode root) {
     if(root == null) return 0;
     if(map.containsKey(root)) return map.get(root);
     int sum = root.val;
     if(root.left!=null){
         sum+=rob(root.left.left);
         sum+=rob(root.left.right);
     }
     if(root.right!=null){
        sum+=rob(root.right.left);
        sum+=rob(root.right.right);
     }
     int nextsum = rob(root.left) + rob(root.right);
     int res = Math.max(sum,nextsum);
     map.put(root,res);
     return res;
    }
}
