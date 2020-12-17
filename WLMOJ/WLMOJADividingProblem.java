/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojadividingproblem;

/**
 *
 * @author jyl10
 */
import java.util.Scanner;
import java.util.Arrays;
public class WLMOJADividingProblem {

    /**
     * @param args the command line arguments
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int findGCF(int a[], int n) {
        int answer = a[0];
        for (int i = 1; i < n; i++) {
            answer = gcd(a[i], answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = input.nextInt();
        }
        System.out.print(findGCF(nums, num));
    }

}
