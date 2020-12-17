/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojasquareproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJASquareProblem {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(long input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            if ((a-b == 1) && isPrime(a+b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}


