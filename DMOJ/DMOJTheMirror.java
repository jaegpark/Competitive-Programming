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
public class DMOJTheMirror {

    /**
     * @param args the command line arguments
     */
    public static int findNumPrime(int one, int two) {
        int count, a, b;
        count = 0;
        a = one;
        b = two;
        boolean kk;

        for (int i = a; i < b; i++) {
            kk = false;
            if (i == 1) kk = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    kk = true;
                    break;
                }
            }
            if (kk == false) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int first, second;
        for (int i = 0; i < num; i++) {
            first = input.nextInt();
            second = input.nextInt();
            System.out.println(findNumPrime(first, second));
        }
    }

}
