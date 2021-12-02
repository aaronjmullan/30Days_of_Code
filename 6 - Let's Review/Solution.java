import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
      // Scanner to read inputs
       Scanner readIn = new Scanner(System.in);
       
       int sLen = readIn.nextInt();
       
       readIn.nextLine();
       
      // Iterate and send string to character based array
       for (int i = 0; i < sLen; i++) {
           
           String s = readIn.nextLine();
           char[] charArray = s.toCharArray();
        // Stdout even indexed characters  
           for (int j = 0; j < charArray.length; j++) {
               if (j % 2 == 0) {
                   System.out.print(charArray[j]);
               }
           }
           
           System.out.print(" " );
          // Stdout odd indexed characters  
           for (int k = 0; k < charArray.length; k++) {
               if (k % 2 != 0) {
                   System.out.print(charArray[k]);
               }
           }         
           System.out.println();           
       }      
       readIn.close();        
    }
}
