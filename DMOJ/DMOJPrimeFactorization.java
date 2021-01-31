
import java.util.Scanner;
import java.util.ArrayList;

public class DMOJPrimeFactorization {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();
        ArrayList<Integer> originalList = new ArrayList<Integer>(numLine);
        // This for loop initializes the integer values on the original array 
        for (int i = 0; i < numLine; i++) {
            originalList.add(input.nextInt());
        }
        for (int i = 0; i < numLine; i++) {
            int n = originalList.get(i);        //sets n as input for factorfind
            ArrayList<Integer> factors = new ArrayList<Integer>();   //dec of answer arrayl
            for (int j = 2; j <= n / j; j++) {
                while (n % j == 0) {
                    factors.add(j);
                    n /= j;                         
                }
            }
            if (n > 1) {
                factors.add(n);//checks for itself
            }

            if (factors.size() == 1) {
                for (int k = 0; k < factors.size(); k++) {


                        System.out.println(factors.get(k));
                    
                }
            } else {
                for (int k = 0; k < factors.size(); k++) {
                    System.out.print(factors.get(k) + "  ");
                }
                System.out.println(" ");
            }
        }
    }
}
