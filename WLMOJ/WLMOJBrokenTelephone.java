/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojbrokentelephone;

/**
 *
 * @author jyl10
 */
import java.util.*;

public class WLMOJBrokenTelephone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numcase = input.nextInt();
        for (int i = 0; i < numcase; i++) {
            int numkids = input.nextInt();
            String main = input.next();
            int counter = 0;
            boolean fairness = true;
            for (int j = 0; j < numkids - 1; j++) {
                String in = input.next();
                if (in.length() == main.length()) {
                    for (int k = 0; k < in.length(); k++) {
                        if (in.charAt(k) != main.charAt(k)) {
                            counter++;
                        }
                    }
                    if (counter > 1) {
                        fairness = false;
                    }
                    counter = 0;
                    main = in;
                }
                else
                    fairness =false;
            }
            if (fairness == true) {
                System.out.println("Fair Game");
            } else {
                System.out.println("Hooligans!");
            }

        }
    }

}
