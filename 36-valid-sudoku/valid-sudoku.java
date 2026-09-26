class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char currentval = board[i][j];
                if(currentval == '.'){
                    continue;
                }
                String row = currentval + "row" + i;
                String col = currentval + "col" + j;
                String box = currentval + "box" + (i/3)*3+(j/3);

                if(!seen.add(row) || !seen.add(col) || !seen.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
}