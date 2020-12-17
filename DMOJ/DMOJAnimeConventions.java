import java.util.*;
import java.io.*;

public class DMOJAnimeConventions {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = readInt();
        int q = readInt();
        LinkedList<Integer>[] adj = new LinkedList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < q; i++) {
            char in = readCharacter();
            int a = readInt();
            int b = readInt();
            if (in == 'A') {
                adj[a].add(b);
                adj[b].add(a);
            } else {
                boolean[] visited = new boolean[n + 1];
                Queue<Integer> qu = new LinkedList<Integer>();
                qu.add(a);
                visited[a] = true;
                while (!qu.isEmpty()) {
                    int cur = qu.poll();
                    for (int v : adj[cur]) {
                        if (!visited[v]) {
                            qu.add(v);
                            visited[v] = true;
                        }
                    }
                }
                System.out.println(visited[b] ? "Y" : "N");
            }

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
