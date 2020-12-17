/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJAFactorialProblem {

    public static boolean check(long p, long n) {
        long temp = p;
        long count = 0;
        long f = 5;
        while (f <= temp) {
            count = count + temp / f;
            f = f * 5;
        }
        return (count >= n);
    }

    public static long findNum(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 5;
        }
        long start = 0;
        long end = 5 * n;
        while (start <= end) {
            long middle = (start + end) / 2;
            if (check(middle, n) == true) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num = Long.parseLong(st.nextToken());
        long ans = findNum(num);
        long count = 1 * 5 + 1;
        boolean out = true;
        long temp = num;
        int modder = 61035156;
        for (int i = 11; i > 0; i--) {
            if (num % modder == modder - 1) {
                out = false;
            } else if (num < modder) {
            } else {
                num -= num / modder;
            }
            modder = (modder - 1) / 5;
        }
        if (out == true && ans !=0) {
            System.out.println(ans);
        } else if (ans == 0) {
            System.out.println("1");
        } else {
            System.out.println("No solution");
        }
    }
}
