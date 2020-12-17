import java.io.*;
import java.util.*;

public class DMOJCrossingField {
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] fields;
    static boolean[][] visited;
    static int condition;
    static int n;

    public static boolean valid(int x, int y) {
        if (x > -1 && x < n && y < n && y > -1) return true;
        return false;
    }

    public static boolean met(int a, int b) {
        if (Math.abs(a - b) <= condition) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = readInt();
        condition = readInt();
        fields = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                fields[i][j] = readInt();
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> qq = new LinkedList<Integer>();
        q.add(0);
        qq.add(0);
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            int curc = qq.poll();
            if (valid(curr - 1, curc) && !visited[curr - 1][curc]&&met(fields[curr][curc], fields[curr-1][curc])) {
                q.add(curr - 1);
                qq.add(curc);
                visited[curr - 1][curc] = true;

            }
            if (valid(curr + 1, curc) && !visited[curr + 1][curc]&&met(fields[curr][curc], fields[curr+1][curc])) {
                q.add(curr + 1);
                qq.add(curc);
                visited[curr + 1][curc] = true;
            }
            if (valid(curr, curc + 1) && !visited[curr][curc + 1]&&met(fields[curr][curc], fields[curr][curc+1])) {
                q.add(curr);
                qq.add(curc + 1);
                visited[curr][curc + 1] = true;
            }
            if (valid(curr, curc - 1) && !visited[curr][curc - 1]&&met(fields[curr][curc], fields[curr][curc-1])) {
                q.add(curr);
                qq.add(curc - 1);
                visited[curr][curc - 1] = true;
            }
        }
        System.out.println(visited[n-1][n-1]?"yes":"no");

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
