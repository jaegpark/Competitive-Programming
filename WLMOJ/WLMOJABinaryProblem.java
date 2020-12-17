/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojabinaryproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJABinaryProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int count1 = 0;
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                count1 += 1;
            }
        }
        pw.println(count1 % 2 == 0 ? "0" : "1");
        pw.close();
    }

}
