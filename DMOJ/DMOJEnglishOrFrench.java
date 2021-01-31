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

public class DMOJEnglishOrFrench {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();
        int t = 0;
        int s = 0;

        for (int i = 0; i <= numLine; i++) {
            String currentLine = input.nextLine();
            String temp = currentLine.toLowerCase();
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                if (ch == 't') {
                    t++;
                }
                if (ch == 's') {
                    s++;
                }
            }
        }
        if (t > s) {
            System.out.println("English");
        }
        if (s >= t) {
            System.out.println("French");
        }
    }

}
