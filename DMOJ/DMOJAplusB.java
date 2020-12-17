/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmojaplusb;

import java.util.Scanner;

/**
 *
 * @author jyl10
 */
public class DMOJAplusB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();

        for (int i = 0; i < numLine; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);

        }
    }
}
