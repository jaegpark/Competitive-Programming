/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcctallpeople2;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class LCCTallPeople2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] towers = new int[n];
        for (int i = 0; i < n; i++) {
            towers[i] = readInt();
            int tot = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (towers[j] < towers[i]) {
                    tot++;
                } else {
                    tot++;
                    break;
                }
            }
            System.out.print(tot + " ");
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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
