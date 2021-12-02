import java.io.*;
import java.util.*;

public class Solution {
 static class Person {
     
    private static int age;
     
     Person(int initialAge) {
         // Check if age passed from main method is positive.
         if (initialAge > 0) {
            age = initialAge;
         } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");   
         }             
     }
     
     public static void yearPasses() {
       // Increment the person's age.
        age++;
                
     }
     
     public static void amIOld() {
         
       // Determines whether the person's age is old and prints the correct statement.
         if (age < 13) {
             System.out.println("You are young.");
         } else if (age < 18) {
             System.out.println("You are a teenager.");
         } else {
             System.out.println("You are old.");
         }
              
     }
     
 }   
    public static void main(String[] args) {

      /* 
       - Scanner to read from stdin
       - Creates new instance of person and passes age
       - Calls amIOld and yearPasses methods
       - Returns output of amIOld method.
      */
        Scanner readIn = new Scanner(System.in);
        int T = readIn.nextInt();
        for(int i = 0; i < T; i++){
            int age = readIn.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int k = 0; k < 3; k++){
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        
      // Close scanner.
        readIn.close();        
        
    }
}  
