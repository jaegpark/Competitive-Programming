/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojeuler;

import java.util.*;
import java.io.*;

/**
 *
 * @author jyl10
 */
public class WLMOJEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String name1 = "";
        String name2;
        int date1;
        int date2 = 0;
        name1 = input.next();
        date1 = input.nextInt();
        for (int i = 1; i < num; i++) {
            name2 = input.next();
            date2 = input.nextInt();
            if (date2 < date1) {
                date1 = date2;
                date2 = 0;
                name1 = name2;
            }
        }
        System.out.println(name1);

    }

}
