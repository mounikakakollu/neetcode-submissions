class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,List<Character>> columnHash = new HashMap<>();
        Map<Integer, List<Character>> rowHash = new HashMap<>();
        Map<Integer, List<Character>> squarHash = new HashMap<>();
        for (int i = 0; i<9; i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j] != '.') {
                    if (rowHash.containsKey(i) &&rowHash.get(i).contains(board[i][j])) {
                        
                        return false;
                    }
                    rowHash.computeIfAbsent(i, k -> new ArrayList<>()).add(board[i][j]);
                    
                }
                if (board[j][i] != '.') {
                    if (columnHash.containsKey(i) && columnHash.get(i).contains(board[j][i])) {
                       
                        return false;
                    }
                    columnHash.computeIfAbsent(i, k-> new ArrayList<>()).add(board[j][i]);
                }

            }
        }
        int sqIndex = 0;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                for (int row = 0; row<3; row++) {
                    for (int col = 0; col<3; col++) {
                        if(board[i*3+row][j*3+col] != '.') {
                            if (squarHash.containsKey(sqIndex) && squarHash.get(sqIndex).contains(board[i*3+row][j*3+col])) {
                               
                                return false;
                            }
                            squarHash.computeIfAbsent(sqIndex, k -> new ArrayList<>()).add(board[i*3+row][j*3+col]);
                        }
                    }
                }
                sqIndex++;
            }
        }

        return true;

        
    }
}
