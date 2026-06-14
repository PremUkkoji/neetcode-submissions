class Solution {

    public boolean validBox(int a, int b, char[][] board) {
        Set<Integer> st = new HashSet<>();
        for(int i=a;i<a+3;i++) {
            for(int j=b;j<b+3;j++) {
                if(board[i][j] != '.' && st.contains(board[i][j]-'0')) {
                    return false;
                }
                if(board[i][j] != '.') st.add(board[i][j]-'0');
            }
        }
        return true;
    }

    public boolean validHLine(int i, char[][] board) {
        Set<Integer> st = new HashSet<>();
        for(int j=0;j<9;j++) {
            if(board[i][j] != '.' && st.contains(board[i][j]-'0')) {
                return false;
            }
            if(board[i][j] != '.') st.add(board[i][j]-'0');
        }
        return true;
    }

    public boolean validVLine(int j, char[][] board) {
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<9;i++) {
            if(board[i][j] != '.' && st.contains(board[i][j]-'0')) {
                return false;
            }
            if(board[i][j] != '.') st.add(board[i][j]-'0');
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        if(validBox(0,0,board) && validBox(0,3, board) &&
            validBox(0,6, board) && validBox(3,0, board) &&
            validBox(3,3, board) && validBox(3,6, board) &&
            validBox(6,0, board) && validBox(6,3, board) &&
            validBox(6,6, board) &&
            validHLine(0, board) && validHLine(1, board) &&
            validHLine(2, board) && validHLine(3, board) &&
            validHLine(4, board) && validHLine(5, board) &&
            validHLine(6, board) && validHLine(7, board) &&
            validHLine(8, board) &&
            validVLine(0, board) && validVLine(1, board) &&
            validVLine(2, board) && validVLine(3, board) &&
            validVLine(4, board) && validVLine(5, board) &&
            validVLine(6, board) && validVLine(7, board) &&
            validVLine(8, board)) { return true; } else return false;
    }
}
