/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lccconsonantsconsonance;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class LCCConsonantsConsonance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer input = new StringBuffer(br.readLine());
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        List<Character> a = Arrays.asList(vowels);
        for (int i = 0; i < input.length(); i++) {
            if (a.contains(input.charAt(i))) {
                input.replace(i, i+1, "");
                i--;
            }
        }
        System.out.print(input);
    }

}
