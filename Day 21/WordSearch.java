package july2020;

public class WordSearch {
	
	private boolean[][] visited;
    private int n, m;
	
	public boolean dfs(char[][] board, String word, int idx, int row, int col) {
		if(idx == word.length()){
            return true;
        }
        
        if(row >= n ||row < 0|| col >= m || col < 0 ||board[row][col] != word.charAt(idx) || visited[row][col]){
            return false;
        }
        
        visited[row][col] = true;
        if(dfs(board, word, idx+1, row-1, col) || 
           dfs(board, word, idx+1, row+1, col) ||
           dfs(board, word, idx+1, row, col-1) || 
           dfs(board, word, idx+1, row, col+1)){
            return true;
        }
        
        visited[row][col] = false;
        return false;
	}
    
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0 || board.length == 0)
            return false;
        n = board.length;
        m = board[0].length;
        visited = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j)) {
					return true;
				}
			}
		}
        return false;
    }

}
