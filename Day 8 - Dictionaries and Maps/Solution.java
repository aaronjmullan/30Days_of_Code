import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        
        int n = readIn.nextInt();
        
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        
        for (int i = 0; i < n; i++) {
            String name = readIn.next();
            int phoneNumber = readIn.nextInt();
            myMap.put(name, phoneNumber);
        }
   
        while (readIn.hasNext()) {
            String s = readIn.next();
            
            if (myMap.get(s) != null) {
                System.out.println(s + "=" + myMap.get(s) );
            } else {
                System.out.println("Not found");
            }
        }
    }
}
