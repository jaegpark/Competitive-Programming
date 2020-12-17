/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojtriangletypes;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;
public class WLMOJTriangleTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        String side, angle;
        if (a1 <90 && a2<90 && a3<90){
            System.out.print("acute ");
        }
        else if(a1 == 90 || a2 == 90 || a3 == 90){
            System.out.print("right ");
        }
        else System.out.print("obtuse");
        
        if (a1== a2 && a2 == a3){
            System.out.print("equilateral");
        }
        else if(a1 == a2 || a2 == a3|| a3 == a1){
            System.out.print("isosceles");
        }
        else System.out.print("scalene");
    }
    
}
