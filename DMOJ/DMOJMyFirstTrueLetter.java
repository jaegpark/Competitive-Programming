/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author jyl10
 */
public class DMOJMyFirstTrueLetter {

    /**
     * @param args the command line arguments
     */
    
    public static char firstLetter(String o, String t){
        char ans = 'a';
        
        return ans;
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = 5;
        String one, two, three, four, five;
        for (int i = 1; i <= 5; i++) {
             one = input.nextLine();
             two = input.nextLine();
             System.out.println(firstLetter(one,two));
             
        }

    }

}
