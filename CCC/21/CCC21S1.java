import java.util.*;
import java.io.*;
class Main {
  public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double ans=0;
        double heights [] = new double[N+1];
        for(int input, i = 0; i<= N; i++){
            input = in.nextInt();
            heights[i]=input;
        }
        for(int input, i= 0; i<N; i++){
            input = in.nextInt();
            ans += (double)(input * ((heights[i]+heights[i+1]))*0.5);
            //System.out.println((double)(input * ((heights[i]+heights[i+1]))*0.5));
        }
        System.out.println(ans);
    }
}