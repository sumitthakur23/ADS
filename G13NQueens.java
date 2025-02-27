import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class G13NQueens {
    public static List<List<String>> sNQ(int n) {
        List<List<String>> res = new ArrayList<>();
    
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        sol(board, 0, res);
        return res;
    }
    private static void sol(char[][]board, int row, List<List<String>> res){
        if(row == board.length){
            res.add(cB(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                sol(board, row + 1, res);
                board[row][col] = '.';
            }
        }
    }
    private static List<String> cB(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }
    public static boolean isSafe(char[][] board, int row, int col){
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        
    }

}

