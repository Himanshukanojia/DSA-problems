class Solution {
    void dfs(int[][] grid,boolean[][] visited,Queue<int[]> q,int i,int j,int[][] dirs){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j] == 0) return;
        visited[i][j] = true;
        q.offer(new int[]{i,j});
        for(int dir[] : dirs) dfs(grid,visited,q,i+dir[0],j+dir[1],dirs);
    }
    public int shortestBridge(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean found = false;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(grid,visited,q,i,j,dirs);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        int step = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                int curr[] = q.poll();
                for (int[] dir : dirs) {
                int i = curr[0] + dir[0];
                int j = curr[1] + dir[1];
                if (i >= 0 && j >= 0 && i < m && j < n && !visited[i][j]) {
                if (grid[i][j] == 1) return step;
                q.offer(new int[]{i, j});
                visited[i][j] = true;
                }
            }
        }
                step++;
    }
    return -1;        
    }
}
