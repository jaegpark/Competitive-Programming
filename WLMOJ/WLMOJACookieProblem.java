import java.util.*;
import java.io.*;

public class WLMOJACookieProblem {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int numCookies = readInt();
        int[] cookies = new int[numCookies];
        for (int i = 0, x; i < numCookies; i++) {
            x = readInt();
            cookies[i] = x;
        }
        int[] sums = new int[numCookies];
        sums[0] = cookies[0];
        for (int i = 1; i < numCookies; i++) {
            if (i == 1) {
                sums[i] = Math.max(sums[i - 1], 0 + cookies[i]);
            } else
                sums[i] = Math.max(sums[i - 1], sums[i - 2] + cookies[i]);
        }
        System.out.println(sums[numCookies-1]);
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
