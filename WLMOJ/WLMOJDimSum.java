/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojdimsum;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
public class WLMOJDimSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a= input.nextInt();
        int b;
        for (int i = 1; i<num; i++){
            b = input.nextInt();
            a = a+b;
        }
        System.out.print(a);
    }
    
}
