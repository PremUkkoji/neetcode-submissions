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
        for (int i = 0; i < 9; i++) {
        if (!validHLine(i, board) || !validVLine(i, board))
            return false;
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!validBox(i, j, board))
                    return false;
            }
        }
        return true;
    }
}
