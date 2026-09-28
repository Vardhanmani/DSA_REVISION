class Solution {
    public boolean helper(char [][]  board , int row, int col){
        if(row == board.length){
            return true;
        }
        int strow = 0;
        int stcol = 0;
        if(col == board.length-1){
            strow = row+1;
            stcol = 0;
        }else{
            strow = row;
            stcol = col+1;
        }
        if(board[row][col] != '.'){
            if(helper(board, strow, stcol)) {
               return true;
            }
        }else{
            for(int i=1 ; i<=9 ; i++){
                if(issafe(board , row , col,i)){
                    board[row][col] = (char) (i +'0');
                    if(helper(board , strow , stcol)){
                        return true;
                    }    
                }
                board[row][col] = '.';                
            }
        }
        return false;
    }
    public boolean issafe(char[][] board , int row , int col, int number){
        for(int i=0;i<board.length;i++){
            //check row
            if(board[i][col] == (char)(number +'0')){
                return false;
            }
            //check col
            if(board[row][i] == (char)(number +'0')){
                return false;
            }
        }
        //check grid
        int sr = row/3 * 3;
        int sc = col/3 * 3;
        for(int i=sr ; i<sr+3 ; i++){
            for(int j=sc ; j<sc+3 ; j++){
                if(board[i][j] == (char)(number +'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        helper(board , 0,0);
    }
}