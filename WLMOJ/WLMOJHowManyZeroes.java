import java.util.*;
import java.io.*;

public class WLMOJHowManyZeroes {
    public static int finder(int k) {
        int ans = 0;
        for (int i = 5; k / i >= 1; i=i*5) {
            ans += k/i;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(finder(Integer.parseInt(br.readLine())));
        }
    }
}
