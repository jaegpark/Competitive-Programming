import java.io.*;
import java.util.*;

public class DMOJTheZagonetkaMachine {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int length = readInt();
        String s = next();
        String t = "", t1 = "";
        int count = 0;
        for (int i = 0; i < length / 2; i++) {
            t += s.charAt(i);
            t1 += s.charAt(length - i - 1);
            if (t.equals(t1)) {
                for (int j = 0; j < length - t.length() + 1; j++) {
                    if (s.substring(j, j + t.length()).equals(t)||s.substring(j,j+t.length()).equals(t1)) {
                        count++;
                        System.out.println(s.substring(j, j + t.length()));
                    }
                }
            }
        }
        //if (s.charAt(0) == s.charAt(length - 1))
        //    System.out.println(count + 1);
      // else
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
