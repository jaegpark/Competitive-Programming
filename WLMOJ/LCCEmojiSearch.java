import java.util.*;
import java.io.*;

public class LCCEmojiSearch {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> indicies = new ArrayList<Integer>();
        String temp = "";
        int a=0, b=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ':') {
                indicies.add(i);
            }
        }
        if (indicies.size()%2 !=0){
            indicies.remove(indicies.size()-1);
        }
        for (int i = 0; i < indicies.size(); i+=2) {
                str.add(s.substring(indicies.get(i) + 1, indicies.get(i + 1)));

        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

    }


}

