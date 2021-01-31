/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class DMOJAplusBH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();  
        
        for (int i = 0; i<numLine; i++){
         long a=input.nextLong();
         long b= input.nextLong();
            System.out.println(a*b);
                   
        }
        }
    }
    