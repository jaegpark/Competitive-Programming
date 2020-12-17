/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojphicircuits;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJPhiCircuits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String mainStr = st.nextToken();
        int[] currents = new int[mainStr.length()];
        currents[0] = 1;
        currents[1] = 1;

        for (int i = 2; i < currents.length; i++) {
            if (mainStr.charAt(i) == 'L') {
                currents[i] = currents[i - 1] + currents[i - 2];
            }
            if (mainStr.charAt(i) == 'R') {
                currents[i] = Math.abs(currents[i - 1] - currents[i - 2]);
            }
        }
        int counter = 0;
        for (int i = 2; i < currents.length; i++) {
            if (mainStr.charAt(i) == 'L') {
                counter += currents[i];
            }
        }
        System.out.println(counter);
    }

}
