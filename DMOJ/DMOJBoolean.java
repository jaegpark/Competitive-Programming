/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmojboolean;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class DMOJBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int count = 0;
        String ans = " ";
        String[] in = input.nextLine().split(" ");
        for (String tf : in) {
            if ("not".equals(tf)) {
                count++;
            }
            if ("False".equals(tf)) {
                ans = "False";
                break;
            }
            if ("True".equals(tf)) {
                ans = "True";
                break;
            }
        }

        if ("False".equals(ans) && count % 2 == 1) {
            System.out.println("True");
        }
        if ("True".equals(ans) && count % 2 == 1) {
            System.out.println("False");
        }
        if (count % 2 == 0) {
            System.out.println(ans);
        }

    }

}
