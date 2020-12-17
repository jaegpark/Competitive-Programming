/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojanexponentialproblem;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
import java.math.*;

public class WLMOJAnExponentialProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        BigInteger base = input.nextBigInteger();
        BigInteger exponent = input.nextBigInteger();
        BigInteger modulo = input.nextBigInteger();

        System.out.print(base.modPow(exponent, modulo));
    }

}
