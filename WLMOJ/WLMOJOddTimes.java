/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojoddtimes;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJOddTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String in = input.next();
        int n = Integer.parseInt(in);
        int count = in.length();
        if (n % 2 == 0) {
            System.out.print("even");
        } else {
            if (count % 2 == 0) {
                System.out.print("odd");
            } else {
                System.out.print("very odd");
            }
        }

    }
}
