/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author jyl10
 */
public class DMOJNextPrime {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(int input) {
        if (input == 1) return false;
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPrime(n) == true) {
            System.out.println(n);
        } else {
            while (isPrime(n) == false) {
                n++;
                if (isPrime(n) == true) {
                    break;
                }
            }
            System.out.println(n);
        }
    }
}
