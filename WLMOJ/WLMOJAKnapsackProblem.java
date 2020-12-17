
import java.util.*;
import java.io.*;

public class WLMOJAKnapsackProblem {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int piececount = readInt();
        int limit = readInt();
        int[] weight = new int[piececount+1];
        int[] value = new int[piececount+1];
        for (int i = 1; i <= piececount; i++) {
            weight[i] = readInt();
            value[i] = readInt();
        }
        int [] [] ans = new int [weight.length+1][limit+1];
        for (int i = 0; i <=limit; i++) {
            ans[0][i] = 0;
        }
        for (int i = 1; i <= piececount; i++) {
            for (int j = 0; j <= limit; j++) {
                if (weight[i]>j){
                    ans[i][j]= ans[i-1][j];
                } else ans[i][j]= Math.max(ans[i-1][j],ans[i-1][j-weight[i]]+value[i]);
            }
        }
        System.out.println(ans[piececount][limit]);
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
