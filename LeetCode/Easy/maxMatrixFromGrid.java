/*
2373. Largest Local Values in a Matrix.
*/

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int[][] maxLocal = new int[row-2][col-2];
        
        for(int i=0;i<maxLocal.length;i++){
            for(int j=0;j<maxLocal[0].length;j++){
                maxLocal[i][j] = getMaxValueAcross3X3Grid(grid, i, j);
            }
        }
        return maxLocal;
    }
    
    
    private int getMaxValueAcross3X3Grid(int[][] grid, int l, int r){
        int max = 0;
        for(int i=l;i<l+3;i++){
            for(int j=r;j<r+3;j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
    
}
