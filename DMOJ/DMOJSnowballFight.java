import java.io.*;
import java.util.*;

public class DMOJSnowballFight {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int h1 = readInt()-1;
        int w1 = readInt();
        int h2 = readInt()-1;
        int w2 = readInt();
        int time1 = h1 * w2;
        int time2 = h2 * w1;
        if (time1 > time2) System.out.println(1);
        else if (time1 < time2) System.out.println(2);
        else if (time1 == time2) System.out.println(-1);

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

