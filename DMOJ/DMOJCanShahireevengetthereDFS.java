import java.util.*;
import java.io.*;

public class DMOJCanShahireevengetthereDFS {
    static BufferedReader br;
    static StringTokenizer st;
    static int numNode, m, a, b;
    static LinkedList<Integer>[] adj;
    static boolean[] visited;    // visited array to see if we've reached that vertex

    // this dfs function finds the total number of nodes in this graph
    public static int dfs(int node) {
        int visCount = 1;
        visited[node] = true;
        for (int neighbour : adj[node]) {
            if (!visited[neighbour]) {
                visCount += dfs(neighbour);
            }
        }
        return visCount;
    }

    public static boolean dfsBool(int node) {
        visited[node] = true;
        if (node == b) return true;
        for (int neighbour : adj[node]) {
            if (!visited[neighbour] && dfsBool(neighbour)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        numNode = readInt();
        m = readInt();
        a = readInt();
        b = readInt();
        adj= new LinkedList[numNode + 1];
        visited = new boolean[numNode + 1];
        for (int i = 0; i <= numNode; i++) {
            adj[i] = new LinkedList<Integer>();     // initializes the linkedlists at each index of the array
        }
        for (int i = 0, x, y; i < m; i++) {        // declares x and y in for loop and goes through until less than m, which is
            x = readInt();   // takes in a vertex number
            y = readInt();   // takes in the vertex number it is adjacent to
            adj[x].add(y);  // at the vertex x, add y because x is connected to y
            adj[y].add(x);  // at the vertex y, add x beacuse y is connected to x (bidirectional)
        }
        pw.println(dfsBool(a) ? "GO SHAHIR!" : "NO SHAHIR!");
        pw.close();
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
