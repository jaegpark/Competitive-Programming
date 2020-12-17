/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojterniaryproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;

public class WLMOJTerniaryProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String in = input.next();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < num; i++) {
            if (in.charAt(i) == '0') {
                count0++;
            }
            if (in.charAt(i) == '1') {
                count1++;
            }
            if (in.charAt(i) == '2') {
                count2++;
            }
        }
        System.out.print(count0 + " " + count1 + " " + count2);

    }

}
