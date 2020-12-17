/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojatwopointersproblem;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJATwoPointersProblem {

    /**
     * @param args the command line arguments
     */
    public static int finder(int[] a, int size, int sum) {
        int ans = size + 1;
        int temp = 0;
        int i = 0, j = 0;
        while (j < size) {
            while (temp < sum && j < size) {
                temp = temp + a[j++];
            }
            while (temp >= sum && i < size) {
                if ((j - i) < ans) {
                    ans = j - i;
                }
                temp = temp - a[i++];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraylength = Integer.parseInt(st.nextToken()), sum = Integer.parseInt(st.nextToken());
        int[] arr = new int[arraylength];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arraylength; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (finder(arr, arraylength, sum) == arraylength + 1) {
            System.out.println(-1);
        } else {
            System.out.println(finder(arr, arraylength, sum));
        }
    }
}
