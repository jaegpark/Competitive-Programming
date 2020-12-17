/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmojtelemarketer;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class DMOJTelemarketer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        if ((a == 8 || a == 9)&&(d==8 || d==9)&&(b==c)) {
            System.out.println("ignore");
        }
        else System.out.println("answer");
    }

}
