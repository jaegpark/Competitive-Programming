import java.io.*;
import java.util.*;

public class DMOJErrands {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();  // number of houses
        int m = readInt();  // number of paths i need to add
        int q = readInt();  // number of queries i need to answer
        int c = readInt();  // the house c we must alwyays visit
        LinkedList<Integer>[] adj = new LinkedList[n + 1];  // make  town with houses
        for (int i = 1; i <= n; i++) {
            adj[i] = new LinkedList<Integer>();     // fill each house with empty path list
        }
        for (int i = 0, x, y; i < m; i++) {     // loops until num of paths are completed
            x = readInt();  // reads the input
            y = readInt();
            adj[x].add(y);  // adds the paths bidirectionally
            adj[y].add(x);
        }
        Queue<Integer> qq = new LinkedList<Integer>();  // make new queue each time we bfs
        boolean visited[] = new boolean[n + 1]; // same deal for boolean
        int[] distance = new int[n + 1];
        qq.add(c);  // starts the bfs from c
        visited[c] = true;  // sets c to true
        distance[c] = 0;    // sets the distance at c to 0
        while (!qq.isEmpty()) {     // goes through queue
            int cur = qq.poll();    // pops
            for (int v : adj[cur]) {        // goes through the current house's paths
                if (!visited[v]) {  // if we havnt visited this neighbouring house
                    visited[v] = true;  // set to visited
                    qq.add(v);
                    distance[v] = distance[cur] + 1;    // add one to the distance at this house
                }
            }
        }
        for (int i = 0, a, b; i < q; i++) {       // goes through the queries
            a = readInt();
            b = readInt();      // takes in the two input
            if (!visited[a] || !visited[b]) {
                System.out.println("This is a scam!"); // else scam
            } else System.out.println(distance[a] + distance[b]);    // if we can visit both a and b, there is a path between a, c, b
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
