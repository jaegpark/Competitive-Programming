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

public class DMOJRotatingLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        String name = input.nextLine();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'I' || name.charAt(i) == 'X' || name.charAt(i) == 'Z' || name.charAt(i) == 'N' || name.charAt(i) == 'O'
                    || name.charAt(i) == 'S' || name.charAt(i) == 'H') {
                count = count+1;
            }
        }
        if (count == name.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
