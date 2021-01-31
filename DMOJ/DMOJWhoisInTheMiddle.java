/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class DMOJWhoisInTheMiddle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = input.nextInt();
        }
        int temp;

        for (int i = 1; i < inputs.length; i++) {
            for (int j = i; j > 0; j--) {
                if (inputs[j] < inputs[j - 1]) {
                    temp = inputs[j];
                    inputs[j] = inputs[j - 1];
                    inputs[j - 1] = temp;
                }
            }
        }
        System.out.println(inputs[1]);

    }

}
