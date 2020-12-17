/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojvibberishgibberish;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJVibberishGibberish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toLowerCase();
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vcount++;
            } else {
                ccount++;
                if (s.charAt(i)==' '){
                   ccount--;
                }
            }
        }
        if (vcount>ccount) System.out.print("Vibberish");
        else if(vcount<ccount) System.out.print("Cibberish");
        else System.out.print("Gibberish");
    }

}
