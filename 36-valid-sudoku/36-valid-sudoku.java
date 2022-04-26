class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> sudokuChecker=new HashSet();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.'){
                if(sudokuChecker.contains("r"+i+board[i][j]) || sudokuChecker.contains("c"+j+board[i][j]))
                    return false;
                sudokuChecker.add("r"+i+board[i][j]);
                sudokuChecker.add("c"+j+board[i][j]);
                if(sudokuChecker.contains("b"+(i/3)*3+j/3+board[i][j]))
                    return false;
                sudokuChecker.add("b"+(i/3)*3+j/3+board[i][j]);
                }
            }
        }
        return true;
    }
}