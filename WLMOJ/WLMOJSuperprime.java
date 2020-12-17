
import java.io.*;
import java.math.*;
import java.util.*;

public class WLMOJSuperprime {

    public static boolean checkPrime(long n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(10);
    }

    public static int counting(String s, long n, int count) {
        if (Long.parseLong(s) > n) return count;
        else {
            if (Integer.parseInt(String.valueOf(s.charAt(0))) != 9) {
                s = (Integer.parseInt(String.valueOf(s.charAt(0))) + 1) + s.substring(1);
            } else if (Integer.parseInt(String.valueOf(s.charAt(0))) == 9) {
                //s =
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int counter = 0;
        boolean valid = true;
        String temp = "" + in;
        // full solution done on c++ 11

    }
}
