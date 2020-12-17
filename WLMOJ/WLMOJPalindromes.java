/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojpalindromes;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
public class WLMOJPalindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(input.readLine());
            String s = st.nextToken();
            System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"YAY":"NAY");
        }
    }
    
}
