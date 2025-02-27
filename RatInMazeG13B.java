import java.util.ArrayList;
import java.util.List;

public class RatInMazeG13B {
    private static void fP(int[][] maze, int x, int y, int n, boolean[][] visit, String path, List<String> paths) {
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] move = {'D', 'R', 'U', 'L'};
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (isSafe(maze, newx, newy, n, visit)) {
                visit[newx][newy] = true;
                fP(maze, newx, newy, n, visit, path + move[i], paths);
                visit[newx][newy] = false;
            }
        }
    }
    private static boolean isSafe(int[][] maze, int x, int y, int n, boolean[][] visit) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visit[x][y];
    }

    public static List<String> FPIM(int[][] maze) {
        int n = maze.length;
        List<String> paths = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) return paths;
        boolean[][] visit = new boolean[n][n];
        visit[0][0] = true;
        fP(maze, 0, 0, n, visit, "", paths);
        return paths;
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
        };
        List<String> paths = FPIM(maze);
        System.out.println(paths);
    }
}