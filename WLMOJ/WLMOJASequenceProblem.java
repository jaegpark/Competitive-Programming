/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojasequenceproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJASequenceProblem {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args){
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] sequence = new int[num];
        int[] test = {10, 7, 5, 3, 3, 6};
        for (int i = 0; i < num; i++) {
            sequence[i] = input.nextInt();
        }
        Arrays.sort(sequence);
        int difference = sequence[num - 1];
        for (int i = 0; i < num - 1; i++) {
            if (sequence[i + 1] - sequence[i] < difference) {
                difference = sequence[i + 1] - sequence[i];
            }
        }
        System.out.println(difference);

    }

}
