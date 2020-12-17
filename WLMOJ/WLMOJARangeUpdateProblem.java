/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojarangeupdateproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJARangeUpdateProblem {

    /**
     * @param args the command line arguments
     */
    public static void makepda(long a[], long p[]) {
        int num = a.length;
        p[num] = -a[num - 1];
        p[0] = a[0];
        for (int i = 1; i < num; i++) {
            p[i] = a[i] - a[i - 1];
        }
    }

    public static void calculate(long [] D, int l, int r, long x) {
        D[l-1] += x;
        D[r] -= x;
    }

    public static void printAns(long[] a, long[] b) {
        int num = a.length;
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                a[i] = b[i];
            } else {
                a[i] = b[i] + a[i - 1];
            }
        }

    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
        long [] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        long [] pda = new long[n + 1];
        makepda(a, pda);
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            long add = Long.parseLong(st.nextToken());
            calculate(pda, start, end, add);
        }
        printAns(a, pda);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }

}
