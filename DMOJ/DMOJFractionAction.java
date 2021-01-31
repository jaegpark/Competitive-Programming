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

public class DMOJFractionAction {

    /**
     * @param args the command line arguments
     */
    public static int asFraction(int a, int b) {
        return a;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numerator = input.nextInt();
        int denominator = input.nextInt();
        System.out.println(asFraction(numerator, denominator));
    }

}
