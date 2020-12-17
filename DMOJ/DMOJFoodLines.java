import java.io.*;
import java.util.*;
public class DMOJFoodLines {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();
        int m = readInt();
        int [] lines = new int[n];
        for (int i = 0,x; i < n; i++) {
             x = readInt();
             lines[i] = x;
        }
        for (int i = m; i >0 ; i--) {
            Arrays.sort(lines);
            System.out.println(lines[0]);
            lines[0] +=1;
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
