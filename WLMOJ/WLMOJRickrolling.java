/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojrickrolling;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
import java.util.Arrays;

public class WLMOJRickrolling {

    /**
     * @param args the command line arguments
     */
    public static boolean isPermuted(String a, String b) {
        String correct = sort(b);
        for (int i = 0; i + b.length() <= a.length(); i++) {
            String substring = a.substring(i, i + b.length());
            if (sort(substring).equals(correct)) {
                return true;
            }
        }

        return false;
    }

    public static String sort(String a) {
        char[] array = a.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String dictionary = "dQw4w9WgXcQ";
        if(isPermuted(input, dictionary)== true){
            System.out.println("rickroll");
        }
        else System.out.println("not a rickroll");

    }

}
