/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lccderekandsnow;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.math.*;

public class LCCDerekAndSnow {

    static Scanner sc = new Scanner(System.in);
    static BigDecimal l = sc.nextBigDecimal();
    static BigDecimal w = sc.nextBigDecimal();
    static BigDecimal d = sc.nextBigDecimal();
    static BigDecimal t = sc.nextBigDecimal();
    static BigDecimal answer = (l.multiply(w).multiply(d).multiply(t)).divide(t);
    static BigDecimal num = new BigDecimal("10.0");

    public static void main(String[] args) {
        BigDecimal ans = (num.multiply(answer)).divide(num);
        String temp = String.valueOf(ans);
        String a = "";
        String decimals = "";
        int counter = 0;
        int location;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != '.') {
                a += temp.charAt(i);
            }
            if (temp.charAt(i) == '.') {
                location = i;
                decimals = temp.substring(i);
                break;
            }
        }
        long deci = Math.round(Double.valueOf(decimals));
        
    }

}
