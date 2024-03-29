class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        for(int i = 1;i<coordinates.length;i++){
            int X = coordinates[i][0] - coordinates[i-1][0];
            int Y = coordinates[i][1] - coordinates[i-1][1];
            if(X*y != x*Y) return false;
        }
        return true;
    }
}
