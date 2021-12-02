import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();        
        bufferedReader.close();
        
        try {
            Integer sInt = Integer.parseInt(S);
            System.out.println(sInt);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }  
    }
}
