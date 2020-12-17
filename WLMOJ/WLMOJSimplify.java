/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojsimplify;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class WLMOJSimplify {

    /**
     * @param args the command line arguments
     */
    private static int reducedFraction(int n, int d) // is given the numerator and denominator
    {
        if (d == 0) // returns the GCD once the given number reaches 0 (after recursive subtraction)
        {
            return n;
        }
        return reducedFraction(d, n - d * (n / d));    // returns recusively, the highest common factor
        // inputs (d, n%d)
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\\D");
        int a = input.nextInt();
        int b = input.nextInt();
        int ansa = a / reducedFraction(a, b);
        int ansb = b / reducedFraction(a, b);
        System.out.println(ansa + "/" + ansb);
    }

}
