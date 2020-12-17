/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojafractionproblem;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class WLMOJAFractionProblem {

    /**
     * @param args the command line arguments
     */
    public static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        long a1 = input.nextInt();
        long a2 = input.nextInt();
        long b1 = input.nextInt();
        long b2 = input.nextInt();

        long ans1 = (a1 * b2) + (b1 * a2);
        long ans2 = a2 * b2 * 2;
        long theGCD = GCD(ans1, ans2);
        ans1 = ans1 / theGCD;
        ans2 = ans2 / theGCD;
        System.out.println(ans1 + " " + ans2);
    }

}
