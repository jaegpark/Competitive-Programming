/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jyl10
 */
import java.util.Scanner;

public class DMOJNewStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int initialNum = input.nextInt();       // number of original students
        double originalAvgSum = 0;              // original sum of class marks
        for (int i = 0; i < initialNum; i++) {
            originalAvgSum = originalAvgSum + input.nextDouble();
        }
        int newStudentNum = input.nextInt();    // number of new students
        double[] nstudentMarks = new double[newStudentNum]; // array of new student marks
        for (int i = 0; i < newStudentNum; i++) {
            nstudentMarks[i] = input.nextDouble();
        }

        double currentMarkSum = originalAvgSum;         // current total (1 by 1)
        for (int i = 0; i < newStudentNum; i++) {
            currentMarkSum = currentMarkSum + nstudentMarks[i]; // adds each new student one by one
            System.out.println((double) Math.round((currentMarkSum / (initialNum + i + 1)) * 1000d) / 1000d);
        }
    }

}
