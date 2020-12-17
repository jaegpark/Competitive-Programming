/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcchardquadratics;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class LCCHardQuadratics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int j = 0; j < num; j++) {

            String equation = input.next();
            int root1 = input.nextInt();
            int root2 = input.nextInt();
            int marker = 0;
            for (int i = 0; i < equation.length(); i++) {
                if (equation.charAt(i) == 'a') {
                    marker = 1;
                    break;
                } else if (equation.charAt(i) == 'b') {
                    marker = 2;
                    break;
                } else if (equation.charAt(i) == 'c') {
                    marker = 3;
                    break;
                }
            }

            if (marker == 1) {
                equation = equation.substring(4);
                int flag = 0;
                String bcoefs = "";
                long bcoef;
                if (equation.charAt(0) == 'x') {
                    bcoef = 1;
                } else {
                    for (int i = 0; i < equation.length(); i++) {
                        if (equation.charAt(i) != 'x') {
                            bcoefs += equation.charAt(i);
                        }
                        if (equation.charAt(i) == 'x') {
                            flag = i;
                            break;
                        }
                    }
                    bcoef = Long.parseLong(bcoefs);
                }
                equation = equation.substring(flag + 1);

                String ccoefs = "";
                for (int i = 0; i < equation.length(); i++) {
                    if (equation.charAt(i) != '=') {
                        ccoefs += equation.charAt(i);
                    }
                    if (equation.charAt(i) == '=') {
                        flag = i;
                        break;
                    }
                }
                long ccoef = Long.parseLong(ccoefs);
                String acoef = String.valueOf(ccoef / (root1 * root2));
                System.out.println(acoef);
            }
            if (marker == 2) {
                int flag = 0;
                String acoefs = "";
                long acoef;
                if (equation.charAt(0) == 'x') {
                    acoef = 1;
                } else {
                    for (int i = 0; i < equation.length(); i++) {
                        if (equation.charAt(i) != 'x') {
                            acoefs += equation.charAt(i);
                        }
                        if (equation.charAt(i) == 'x') {
                            flag = i;
                            break;
                        }
                    }
                    acoef = Long.parseLong(acoefs);
                }
                equation = equation.substring(flag + 4);

                for (int i = 0; i < equation.length(); i++) {
                    if (equation.charAt(i) == 'x') {
                        flag = i;
                        break;
                    }
                }
                equation = equation.substring(flag + 1);
                String ccoefs = "";
                long ccoef;
                if (equation.charAt(0) == '=') {
                    ccoef = 1;
                } else {
                    for (int i = 0; i < equation.length(); i++) {
                        if (equation.charAt(i) != '=') {
                            ccoefs += equation.charAt(i);
                        }
                        if (equation.charAt(i) == '=') {
                            flag = i;
                            break;
                        }
                    }
                    ccoef = Long.parseLong(ccoefs);
                }
                String bcoef = String.valueOf(-1 * acoef * (root1 + root2));
                System.out.println(bcoef);
            }
            if (marker == 3) {
                int flag = 0;
                String acoefs = "";
                long acoef;
                if (equation.charAt(0) == 'x') {
                    acoef = 1;
                } else {
                    for (int i = 0; i < equation.length(); i++) {
                        if (equation.charAt(i) != 'x') {
                            acoefs += equation.charAt(i);
                        }
                        if (equation.charAt(i) == 'x') {
                            flag = i;
                            break;
                        }
                    }
                    acoef = Long.parseLong(acoefs);
                }
                equation = equation.substring(flag + 4);
                String bcoefs = "";
                for (int i = 0; i < equation.length(); i++) {
                    if (equation.charAt(i) != 'x') {
                        bcoefs += equation.charAt(i);
                    }
                    if (equation.charAt(i) == 'x') {
                        flag = i;
                        break;
                    }
                }
                long bcoef = Long.parseLong(bcoefs);
                equation = equation.substring(flag + 1);
                String ccoef = String.valueOf(root1 * root2 * acoef);
                System.out.println(ccoef);

            }
        }

    }

}
