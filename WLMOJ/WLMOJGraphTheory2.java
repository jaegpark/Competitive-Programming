
import java.io.*;
import java.util.*;
public class WLMOJGraphTheory2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        long k = Long.parseLong(st.nextToken()), j = Long.parseLong(st.nextToken());
        pw.println(k<=j?"Scam!":"Graph Theory!");
        pw.close();
    }
}
