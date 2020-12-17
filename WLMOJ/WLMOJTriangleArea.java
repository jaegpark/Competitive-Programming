/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojtrianglearea;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
public class WLMOJTriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] a= new int[3];;
        for (int i = 0; i<3; i++){
          a[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i<3; i++){
            for (int j = i+1; j<3; j++){
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(a[0]*a[1]/2);
    }
    
}
