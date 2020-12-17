import java.io.*;
import java.util.*;

public class WLMOJAnArrayProblem {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int length = readInt();
        int num = readInt();
        int [] array = new int[length+1];
        for (int i = 1; i <= length; i++) {
            array[i] = readInt();
        }
        for (int i = 0; i < num; i++) {
            int cur = readInt();
            if (cur==1){
                int start = readInt();
                int end = readInt();
                int take = readInt();
                int condition = readInt();
                for (int j = start; j <= end; j++) {
                    if (array[j]>condition)
                    array[j] -=take;
                }
            }else if (cur == 2){
                int start = readInt();
                int end = readInt();
                int condition = readInt();
                long sum=0;
                for (int j = start; j <=end ; j++) {
                    if (array[j]>condition) sum+=array[j];
                }
                System.out.println(sum);
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
