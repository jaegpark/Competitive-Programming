import java.util.*;
import java.io.*;

public class WLMOJAMaximizationProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long k;
        if (n % 3 == 0) {
            k = n / 3;
            System.out.println(k * k * k + k * k + k * k + k * k);
        } else if (n % 3 == 1) {
            k = n / 3;
            long m = k + 1;
            System.out.println(k * k * m + k * k + k * m + m * k);
        } else if (n % 3 == 2) {
            k = n / 3;
            long m = k + 1;
            long l = k+1;
            System.out.println(k * m * l + k * m + m * l + k * l);
        }
    }
}
