class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for( int i=0; i< grid.length; i++){
            for( int j=0; j< grid[0].length; j++){
                int area =0;
                if( grid[i][j] ==1){
                    area = dfs( grid, i, j);  // going deep when we get a pice of island 
                    max  = Math.max( max, area); // taking the max value 
                }
            }
        }
        return max;
    }
    int dfs(int[][] grid, int i, int j) {
        // base condition hwere recursion will stop and return back with 0
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] =0;   // mark visited 
        
        // going deeper in all the four direction 
        return 1+ dfs(grid, i-1,j)+
                dfs(grid, i+1,j)+
                dfs(grid, i,j+1)+
                dfs(grid, i,j-1);
    }
}
