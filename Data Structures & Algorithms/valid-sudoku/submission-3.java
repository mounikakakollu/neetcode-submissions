class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,List<Character>> columnHash = new HashMap<>();
        Map<Integer, List<Character>> rowHash = new HashMap<>();
        Map<String, List<Character>> squarHash = new HashMap<>();
        for (int i = 0; i<9; i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                String sqIndex = (i/3) + "," + (j/3);

                if (rowHash.computeIfAbsent(i, k -> new ArrayList<>()).contains(board[i][j]) ||       columnHash.computeIfAbsent(j, k -> new ArrayList<>()).contains(board[i][j]) || squarHash.computeIfAbsent(sqIndex, k -> new ArrayList<>()).contains(board[i][j])) {
                    return false;
                }

                rowHash.get(i).add(board[i][j]);
                columnHash.get(j).add(board[i][j]);
                squarHash.get(sqIndex).add(board[i][j]);


            }
        }
        return true;
    }
}
