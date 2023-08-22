class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)Bottom View of Binary Tree
    {
       ArrayList<Integer> ans = new ArrayList<>();
       Map<Integer,Integer> map = new TreeMap<>();
       Queue<Node> q = new LinkedList<>();
       root.hd=0;
       q.add(root);
       while(!q.isEmpty()){
           Node temp = q.remove();
           int hd = temp.hd;
           map.put(hd,temp.data);
           if(temp.left!= null){
               temp.left.hd = hd -1;
               q.add(temp.left);
           }
           if(temp.right !=null){
               temp.right.hd = hd+1;
               q.add(temp.right);
           }
       }
       for(Map.Entry<Integer,Integer> e : map.entrySet()) ans.add(e.getValue());
       return ans;
    }
}
