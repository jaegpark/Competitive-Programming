/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author jyl10
 */
public class DMOJListMinimum {

    /**
     * @param args the command line arguments
     */
    public static int place = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int place = 0;
        int numLine = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < numLine; i++) {
            arrayList.add(input.nextInt());
        }
        while(arrayList.size()>0) {
            int minValue = arrayList.get(0);
            place = -1;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) <= minValue) {
                    minValue = arrayList.get(i);
                    place = i;
                }
            }
            answer.add(arrayList.remove(place));
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

}
