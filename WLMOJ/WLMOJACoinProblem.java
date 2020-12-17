/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojacoinproblem;

/**
 *
 * @author jyl10
 */
import java.io.*;
import java.util.*;

public class WLMOJACoinProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numCoinType = input.nextInt();
        int sum = input.nextInt();
        boolean[] can = new boolean[sum + 1];   // make new boolean array for all values under sum
        can[0] = true;  // sets sum=0 to true (no coins used)
        int temp;       // stores the user input for coin type
        for (int i = 0; i < numCoinType; i++) { // goes through all coin types, and compares each one with the others' potential sums
            temp = input.nextInt();    
            for (int j = 0; j < sum; j++) {
                if (can[j] == true && j + temp <= sum) {  
                    can[j + temp] = true;
                }
            }
        }
        if (can[sum] == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
