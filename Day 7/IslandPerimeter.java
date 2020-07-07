package july2020;

public class IslandPerimeter {
	
	public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(n == 0)
            return 0;
        int perimeter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;
                    if(i-1 >= 0 && grid[i-1][j] == 1) perimeter--;
                    if(i+1 < n && grid[i+1][j] == 1) perimeter--;
                    if(j-1 >= 0 && grid[i][j-1] == 1) perimeter--;
                    if(j+1 < m && grid[i][j+1] == 1) perimeter--;
                }
            }
        }
        return perimeter; 
    }

}
