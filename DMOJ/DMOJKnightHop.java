import java.io.*;
import java.util.*;

public class DMOJKnightHop {
    static BufferedReader br;
    static StringTokenizer st;
    static int xk, yk, xf, yf;
    static LinkedList<Integer>[] adj;
    static boolean[][] visited;

    public static boolean rangeCheck(int x, int y) {
        if (x < 9 && x > 0 && y < 9 && y > 0) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter((new OutputStreamWriter(System.out)));
        int xMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};
        int yMoves[] = {2, 1, -1, -2, -2, -1, 1, 2};
        xk = readInt();
        yk = readInt();
        xf = readInt();
        yf = readInt();
        int [] [] board = new int [9][9];
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> qq = new LinkedList<Integer>();
        adj = new LinkedList[9];
        visited = new boolean[9][9];
        int [][] distance = new int[9][9];
        visited[xk][yk] = true;
        distance[xk][yk] = 0;
        q.add(xk);
        qq.add(yk);
        while(!q.isEmpty()){
            int curx = q.poll();
            int cury = qq.poll();
            for (int i = 0; i < 8; i++) {
                if (rangeCheck(curx+xMoves[i], cury+yMoves[i])&&!visited[curx+xMoves[i]][cury+yMoves[i]]){
                    q.add(curx+xMoves[i]);
                    qq.add(cury+yMoves[i]);
                    visited[curx+xMoves[i]][cury+yMoves[i]] = true;
                    distance[curx+xMoves[i]][cury+yMoves[i]]=distance[curx][cury] +1;
                }
            }
        }
        System.out.println(distance[xf][yf]);



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
