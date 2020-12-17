/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojprogrammingelectrons;

/**
 *
 * @author jyl10
 */
import java.util.*;

public class WLMOJProgrammingElectrons {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numtest = input.nextInt();
        for (int k = 0; k < numtest; k++) {
            int numpep = input.nextInt();
            List<String> names = new ArrayList<String>(numpep);
            List<String> gender = new ArrayList<String>(numpep);
            List<Integer> votes = new ArrayList<Integer>(numpep);

            for (int i = 0; i < numpep; i++) {
                names.add(input.next());
                gender.add(input.next());
                votes.add(input.nextInt());
            }

            List<Integer> tempvote = new ArrayList<Integer>(numpep);
            for (int i = 0; i < numpep; i++) {
                tempvote.add(votes.get(i));
            }
            Collections.sort(tempvote);
            int flag = tempvote.get(numpep - 1);  // highest vote number

            int marker = 0;
            String femname = "", malename = "";
            for (int i = 0; i < numpep; i++) {  // goes through original votes array
                if (flag == votes.get(i)) {         // if they have highest vote count
                    if (gender.get(i).equals("M")) {    // if male
                        malename = names.get(i);        // set male name
                        marker = 1;
                        votes.remove(i);
                        gender.remove(i);
                        names.remove(i);
                        tempvote.remove(numpep - 1);
                        break;
                    }
                    if (gender.get(i).equals("F")) {    // if female
                        femname = names.get(i);         // set female name
                        marker = 2;
                        votes.remove(i);
                        gender.remove(i);
                        names.remove(i);
                        tempvote.remove(numpep - 1);
                        break;
                    }
                }
            }
            for (int j = 0; j < names.size(); j++) {
                flag = tempvote.get(tempvote.size() - 1 - j);
                for (int i = 0; i < votes.size(); i++) {
                    if (marker == 1 && flag == votes.get(i)&&"F".equals(gender.get(i))) {
                        femname = names.get(i);
                        break;
                    }
                    if (marker == 2 && flag == votes.get(i)&& "M".equals(gender.get(i))) {
                        malename = names.get(i);
                        break;
                    }

                }
                if (!malename.equals("") && !femname.equals("")) {
                    break;
                }
            }
            System.out.println(femname + " " + malename);

        }

    }
}
