/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojelettery;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJELettery {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int casenum = input.nextInt();
        for (int i = 0; i < casenum; i++) {
            String mainname = input.next();
            int numpep = input.nextInt();
            String[] candidates = new String[numpep];
            for (int j = 0; j < numpep; j++) {
                candidates[j] = input.next();
            }
            int[] counters = new int[numpep];
            for (int l = 0; l < numpep; l++) {
                String tempmain = mainname;
                for (int j = 0; j < (candidates[l]).length(); j++) {
                    if (tempmain.contains(String.valueOf(candidates[l].charAt(j)))) {
                        counters[l]++;
                        char replace = candidates[l].charAt(j);
                        tempmain = tempmain.substring(0, tempmain.indexOf(replace)) + tempmain.substring(tempmain.indexOf(replace)+1);
                    }
                }
            }

            int flag;
            int[] temp = new int[numpep];
            for (int j = 0; j < numpep; j++) {
                temp[j] = counters[j];   
            }
            Arrays.sort(counters);
            flag = counters[numpep - 1];
            ArrayList<String> answer = new ArrayList<String>();
            for (int j = 0; j<numpep; j++){
                if (temp[j]==flag){
                    answer.add(candidates[j]);
                }
            }
            Collections.sort(answer);
            System.out.println(answer.get(0));
            
        }
    }

}
