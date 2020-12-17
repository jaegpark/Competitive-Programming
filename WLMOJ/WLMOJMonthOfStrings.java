/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojmonthofstrings;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
public class WLMOJMonthOfStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String in = input.next();
        String reverse = "";
        in = in.toUpperCase();
        if(in.contains("AUGUST")){
            System.out.println("NOU");
        }
        else{
            
            for (int i = in.length()-1; i>=0; i--){
                reverse = reverse+in.charAt(i);
            }
            reverse = reverse.replaceAll("A","S");
            System.out.println(reverse);
        }
    }
    
}
