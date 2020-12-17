import java.io.*;
import java.util.*;
public class DMOJBallSculpture {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();
        int m = readInt();
        LinkedList<Integer> [] adj = new LinkedList[n+2];
        for (int i = 1; i < n+2; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        boolean[] states = new boolean[n + 2];
        for (int i = 1; i <= n; i++) {
            int a = readInt();
            int b = readInt();
            adj[i].add(a);
            adj[i].add(b);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            q.add(1);
            while (!q.isEmpty()) {
                int cur = q.poll();
                if (cur == n + 1) break;
                else {
                    for (int v : adj[cur]) {
                        if (v==3){
                            if (states[cur]) states[cur] = false;
                            else states[cur] = true;
                            break;
                        }
                        if (!states[cur]){
                            states[cur]= true;
                            q.add(adj[cur].get(0));
                            break;
                        } else if (states[cur]){
                            states[cur]=false;
                            q.add(adj[cur].get(1));
                            break;
                        }
                    }
                }
            }

        }
        for (int k = 1; k <= n; k++) {
            if (states[k]) System.out.print(1);
            else System.out.print(0);
        }
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
