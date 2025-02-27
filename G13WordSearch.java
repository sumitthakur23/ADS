public class G13WordSearch {
    public static boolean exist(char[][] brd, String wrd) {
        int r = brd.length, c = brd[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (brd[i][j] == wrd.charAt(0) && dfs(brd, i, j, wrd, 0)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] brd, int i, int j, String wrd, int index) {
        if (index == wrd.length()) return true;
        if (i < 0 || i >= brd.length || j < 0 || j >= brd[0].length || brd[i][j] != wrd.charAt(index)) {
            return false;
        }
        char temp = brd[i][j];
        brd[i][j] = '#';
        boolean fou = dfs(brd, i + 1, j, wrd, index + 1) ||
                      dfs(brd, i - 1, j, wrd, index + 1) ||
                      dfs(brd, i, j + 1, wrd, index + 1) ||
                      dfs(brd, i, j - 1, wrd, index + 1);
        brd[i][j] = temp;
        return fou;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}