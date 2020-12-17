/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojsubarraymaximization;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJSubarrayMaximization {

    /**
     * @param args the command line arguments
     */
    public static long maxSubArraySum(long a[], int arrsize) {
        long ansMax = a[0];
        long currentMax = a[0];

        for (int i = 1; i < arrsize; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            ansMax = Math.max(ansMax, currentMax);
        }
        return ansMax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long a[] = new long[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextLong();
        }
        long ans = maxSubArraySum(a, num);
        System.out.println(ans);
    }

}
