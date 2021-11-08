import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

      // Set variables equal to predefined values
        String s = "HackerRank ";
        double d = 4.0;
        int i = 4;
        
       // Create scanner object to read and save inputs to second integer, double and string variables
        Scanner scanIn = new Scanner(System.in);
        int i2 = scanIn.nextInt();
        double d2 = scanIn.nextDouble();
        scanIn.nextLine();
        String s2 = scanIn.nextLine();
        
      // Print the sum of both integer variables on a new line
      // Print the sum of both double variables on a new line  
      // Print the Concatenation of both string variables on a new line 
        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);
        
        scan.close();
    }
}
