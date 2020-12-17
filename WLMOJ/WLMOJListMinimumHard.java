/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojlistminimumhard;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
import java.math.*;

public class WLMOJListMinimumHard {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        for (int i = 0; i < num; i++) {
            System.out.println(list[i]);
        }

    }

}
