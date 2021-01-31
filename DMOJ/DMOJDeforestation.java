/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.StringTokenizer;

public class DMOJDeforestation {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br;
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(nextLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String nextLine() throws IOException {
        String s = br.readLine();
        if (s == null) {
            exit();
        }
        st = null;
        return s;
    }

    static void exit() {
        System.exit(0);
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        br = new BufferedReader(new InputStreamReader(System.in));
        int numTree = readInt();
        int[] psa = new int[numTree + 1];
        psa[0] = 0;
        for (int i = 1; i <= numTree; i++) {
            psa[i] = readInt();
            psa[i] += psa[i - 1];
        }
        int numQ = readInt();
        for (int i = 0; i < numQ; i++) {
            int a = readInt();
            int b = readInt();
            int sum = psa[b + 1] - psa[a];
            System.out.println(sum);
        }
    }
}
