import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class DMOJWaterpark {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int num = readInt();
        LinkedList<Integer> adj[] = new LinkedList[num + 1];
        for (int i = 1; i <= num; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        int a = readInt();
        int b = readInt();
        while (a!=0 && b!=0) {
            adj[a].add(b);
            a = readInt();
            b = readInt();
        }
        int[] numPaths = new int[num + 1];
        numPaths[1] = 1;
        for (int i = 1; i <= num; i++) {
            for (int v : adj[i]) {
                numPaths[v] += numPaths[i];
            }
        }
        System.out.println(numPaths[num]);
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
