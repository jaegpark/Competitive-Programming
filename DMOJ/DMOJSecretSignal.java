import java.io.*;
import java.util.*;

public class DMOJSecretSignal {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();
        int k = readInt();
        int[] message = new int[n];
        for (int i = 0, x; i < n; i++) {
            x = readInt();
            if (x > k) x %= k;
            message[i] = x;
        }
        int count = 0;
        long cur;
        for (int i = 0; i < n; i++) {
            cur = message[i];
            if (cur == 0) count++;
            for (int j = i + 1; j < n; j++) {
                cur += message[j];
                if (cur == k) {
                    count++;
                    cur = 0;
                } else if (cur > k) {
                    cur -= k;
                }
            }
        }
        System.out.println(count);
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
