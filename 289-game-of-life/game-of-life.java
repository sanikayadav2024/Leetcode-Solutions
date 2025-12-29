class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
           if(isAlive(board, i, j)){
            board[i][j] += 2;
           }
        }
       } 
       for( int i = 0; i < m; i++){
        for( int j = 0; j < n; j++){
           board[i][j] /= 2;
        }
       } 
    }

    private boolean isAlive(int[][] board, int i, int j){
       int m = board.length;
       int n = board[0].length;
       int count = 0;
       if(i - 1 >= 0 && j - 1 >= 0 && board[i-1][j-1]%2 == 1) count++;
       if(i - 1 >= 0 && board[i-1][j]%2 == 1) count++;
       if(i - 1 >= 0 && j + 1 < n && board[i-1][j+1]%2 == 1) count++;
       if(j - 1 >= 0 && board[i][j - 1]%2 == 1) count++;
       if(j + 1 < n && board[i][j+1]%2 == 1) count++;
       if(i + 1 < m && j - 1 >=0 && board[i+1][j-1]%2 == 1) count++;
       if(i + 1 < m && board[i+1][j]%2 == 1) count++;
       if(i + 1 < m && j + 1 < n && board[i+1][j+1]%2 == 1) count++;

       
       if(count == 3 && board[i][j] == 0) return true;
       if(count < 2 && board[i][j] == 1) return false;
       if((count == 2 || count == 3) && board[i][j] == 1) return true;
       if(count > 3 && board[i][j] == 1) return false;
       return false;
    }
}