class Solution {
    public int numIslands(char[][] grid) {
        // List<List<Character>> visited = new ArrayList<>();
        int count = 0;
        for(int i=0; i< grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if( grid[i][j] == '1' ){
                    count+=1;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }
    void dfs(int i, int j, char[][] grid ){
        
        if( i<0 || j<0 || i>=grid.length || j>= grid[0].length){
            return ;
        }
        if( grid[i][j] =='0'){
            return ;
        }
        grid[i][j] = '0';   // mark visited 

          //left
        dfs(i, j-1, grid);
           //up 
        dfs(i, j+1, grid);
        
        //right 
        dfs(i+1,j , grid);
        
        //down 
        dfs(i-1, j, grid);
        
        

    }
}
