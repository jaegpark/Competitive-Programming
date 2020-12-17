/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojarookproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
import java.math.*;

public class WLMOJARookProblem {

    public static BigInteger nChooseR(final int N, final int K) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < K; i++) {
            ans = ans.multiply(BigInteger.valueOf(N - i)).divide(BigInteger.valueOf(i + 1));
        }
        return ans;
    }
    
    public static BigInteger factorial(final int N){
        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i<N; i++){
            ans = ans.multiply(BigInteger.valueOf(N-i));
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        BigInteger ans = factorial(k).multiply(nChooseR(n,k).pow(2));
        System.out.print(ans);
    }

}
