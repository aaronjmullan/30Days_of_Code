import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      // Open bufferedReader to read inputs.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      // Declare variable equal to current line of input stream.
        int N = Integer.parseInt(bufferedReader.readLine().trim());

      // Check if the value of variable 'n' is odd/even and continue with logic
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N >=2 && N<= 5) {
            System.out.println("Not Weird");
        } 
        else if (N >=6 && N <= 20) {
            System.out.println("Weird");
        } 
        else if (N > 20) {
            System.out.println("Not Weird");
        }
        }
      // Close bufferedReader as no longer needed.
        bufferedReader.close();
        
    }
}
