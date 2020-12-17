/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojinterviewseating;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
public class WLMOJInterviewSeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String one = input.next();
        String two = input.next();
        int flag = 0;
        for (int i = 0; i<num; i++){
            if (one.charAt(i) == two.charAt(i) && one.charAt(i)=='O'){
                flag = i;
                break;
            }
        }
        if (flag !=0)
        System.out.print(":)");
        else System.out.print(":(");
    }
    
}
