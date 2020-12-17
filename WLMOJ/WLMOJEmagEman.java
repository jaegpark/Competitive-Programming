/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojemageman;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class WLMOJEmagEman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String in;
        String reverse = "";

        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            in = input.next();
            for (int j = in.length() - 1; j >= 0; j--) {
                reverse = reverse + in.charAt(j);
            }
            System.out.println(reverse);
            reverse = "";

        }
    }

}
