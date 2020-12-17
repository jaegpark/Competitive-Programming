import java.io.*;
import java.util.*;

public class LCCLineIntersections {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int[] slopes = new int[n];
        int[] yint = new int[n];
        int[] MAXY = new int[100000];
        int[] soly = new int[100000];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            slopes[i] = (Integer.parseInt(st.nextToken()));
            yint[i] = (Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j <n; j++) {
                MAXY[j] = slopes[j] * i + yint[j];
            }
            Arrays.sort(MAXY);
            soly[i] = MAXY[n-1];
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += soly[i];
        }
        System.out.println(sum);

    }
}
