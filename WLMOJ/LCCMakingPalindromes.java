import java.io.*;
import java.util.*;

public class LCCMakingPalindromes {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int num = readInt();
        ArrayList<Integer> codes = new ArrayList<>();
        ArrayList<Integer> digit = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String x = next();
            digit.add(Integer.parseInt("" + x.charAt(0)));
            if (digit.contains(Integer.parseInt("" + x.charAt(0)))) {
                codes.add(Integer.parseInt(x));
                digit.add(Integer.parseInt("" + x.charAt(0)));
            }
        }
        System.out.println(codes);
        boolean[] visited = new boolean[codes.size()];
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < codes.size(); j++) {

                int x = Integer.parseInt(String.valueOf(codes.get(j)).substring(0, 2 + i));
                for (int k = 0; k < codes.size(); k++) {
                    if (x == Integer.parseInt(String.valueOf(codes.get(k)).substring(0, 2 + i)) && k != j) {
                        visited[j] = true;
                        visited[k] = true;
                    }
                }

            }
        }
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                count++;
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
