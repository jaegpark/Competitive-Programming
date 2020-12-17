/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lccwrongdereck;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class LCCWrongDereck {

    /**
     * @param args the command line arguments
     */
    // Method to sort a string alphabetically 
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String name = "";
        int n = 0;
        in = in.replace('3', 'e');
        in = in.replace("5", "s");
        in = in.replace("@", "a");
        in = in.replace("7", "t");
        in = in.replace("1", "i");
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == ' ') {
                n++;
            }
        }
        String[] words = new String[n + 1]; // array stores the string value of all the words inside the sentence separated by space
        Arrays.fill(words, ""); // fills it with nulls intially
        words = in.split(" ");
        String s = "dereck";
        String t = "";
        s = sortString(s);
        for (int i = 0; i < in.length() - s.length() + 1; i++) {
            t = in.substring(i, i + s.length());
            t = sortString(t);
            if (t.equals(s)) {
                name = "java";
                break;
            }
        }

        boolean containsJava = false;

        for (String word : words) {
            if (word.contains("biginteger") || word.contains("apics")) {
                containsJava = true;    // once finds, breaks, and then goes to output
                break;
            }
        }

        if ((name.equals("java") && containsJava == true) || (!name.equals("java") && !containsJava)) {
            System.out.println("Right Dere(c)k!");
        } else {
            System.out.println("Wrong Dere(c)k!");
        }
    }

}
