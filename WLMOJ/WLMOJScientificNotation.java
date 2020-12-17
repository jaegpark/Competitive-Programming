/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojscientificnotation;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
import java.math.*;

public class WLMOJScientificNotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        boolean sci = true;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '*') {
                sci = false;
            }
        }
        if (sci == true) {
            double num = Double.parseDouble(in);
            int k = in.length() - 1;
            double ans = num / (Math.pow(10, in.length() - 1));
            if (k == 0 && num == 1) {
                System.out.println("1.00 * 10^1");

            } else if (k == 1) {
                System.out.print(Math.round(ans * 100.00) / 100.00);
                System.out.print("0" + " * " + "10^" + (in.length() - 1));
            } else {
                System.out.print(Math.round(ans * 100.00) / 100.00);
                System.out.print(" * " + "10^" + (in.length() - 1));
            }
        } else {
            double n = Double.parseDouble(in.substring(0, 4));
            int power = Integer.parseInt(in.substring(10));
            System.out.print(Math.round(n * Math.pow(10, power)));
        }
    }

}
