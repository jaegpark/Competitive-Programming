import java.io.*;
import java.util.*;

public class WLMOJFizzBuzz {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("fizzbuzz");
            else {
                if (i % 3 == 0) System.out.println("fizz");
                else if (i % 5 == 0) System.out.println("buzz");
                else System.out.println(i);
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
