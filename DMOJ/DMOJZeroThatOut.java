/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmojzerothatout;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jyl10
 */
public class DMOJZeroThatOut {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numrounds = input.nextInt();
        Stack<Integer> declared = new Stack<Integer>();
        for (int i = 0; i < numrounds; i++) {
            int x = input.nextInt();
            if (x != 0) {
                declared.push(x);
            } else {
                declared.pop();
            }
        }
        int total = 0;
        while (declared.size()>0) {
            total = total + declared.pop();
        }
        System.out.println(total);

    }
    
}
