class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == words[0] && exist(board, words, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, char[] words, int i, int j, int idx){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '*' ||  board[i][j] != words[idx])  return false;

        char ch = board[i][j];
        board[i][j] = '*';

        

        if(idx == words.length-1) return true;

        boolean res = exist(board, words, i+1, j, idx+1) || 
                      exist(board, words, i-1, j, idx+1) ||
                      exist(board, words, i, j+1, idx+1) ||
                      exist(board, words, i, j-1, idx+1);
        board[i][j] = ch;
        return res;
    }
}