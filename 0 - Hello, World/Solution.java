import java.io.Scanner;

public class Solution {

    public static void main(String[] args) {
         
      // Create Scanner object to read input from stdin.
        Scanner scanIn = new Scanner(System.in);
        
      // Save full line of input to variable, inputString.
        String inputString = scanIn.nextLine();
            
      // Close scanner object, read all needed for challenge.
        scanIn.close();
      
      // Print string 'Hello, World.' to stdout.
      // Print contents of inputString variable to stdout.
        System.out.println("Hello, World.");
        System.out.println(inputString);
                
    }
}
