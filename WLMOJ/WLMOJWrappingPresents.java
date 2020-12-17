/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojwrappingpresents;

/**
 *
 * @author jyl10
 */
import java.util.*;
public class WLMOJWrappingPresents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int ans = 2*a*b+2*b*c+2*c*a;
        System.out.println(ans);
    }
    
}
