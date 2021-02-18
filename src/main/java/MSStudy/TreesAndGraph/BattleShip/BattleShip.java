package MSStudy.TreesAndGraph.BattleShip;

public class BattleShip {
    public int countBattleships(char[][] board) {
        int count =0;

        for(int i=0; i<board.length;i++){
            for(int j=0; j< board[i].length; j++){
                if(board[i][j] == 'X'){
                    count++;
                    sink(board,i,j);
                }
            }
        }

        return count;
    }


    private void sink(char[][] board, int i, int j){
        if(i<0 || i>=board.length ||j < 0 || j>=board[0].length || board[i][j] != 'X'){
            return;
        }

        board[i][j] = '.';

        sink(board, i+1,j);
        sink(board, i-1,j);
        sink(board, i,j+1);
        sink(board, i,j-1);
    }
}
