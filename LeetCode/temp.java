// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        int[][] mat = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        HelloWorld obj = new HelloWorld();
        int[][] matrixData = obj.makeMaxMatrix(mat);
        for(int i=0;i<matrixData.length;i++){
            for(int j=0;j<matrixData[0].length;j++){
                System.out.println(matrixData[i][j]);
            }
        }
    }
    
    public int[][] makeMaxMatrix(int[][] grid){
        int[][] newMatrix = new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                newMatrix[i][j] = getMaxVal(grid, i, j);
            }
        }
        return newMatrix;
    }
    
    public int getMaxVal(int[][] grid, int l, int r){
        int max = 0;
        for(int i = 0;i<l+3;i++){
            for(int j=0;j<r+3;j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}
