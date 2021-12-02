import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      // BufferedReader to read inputs in stream.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      // Set variable 'n' to value on current line.
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = 0;
        
      // Iterate through and display multiples of 'n' 10 times.
        for (int i = 1; i < 11; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

      // Close BufferedReader.
        bufferedReader.close();
    }
}
