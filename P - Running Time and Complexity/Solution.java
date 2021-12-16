import java.io.*;
import java.util.*;

public class Solution {

    public static boolean primeCheck(int n) {
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
               
        Scanner readin = new Scanner(System.in);
        int T = readin.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = readin.nextInt();
            
            if (n >= 2 && primeCheck(n)) 
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        readin.close();
    }
}
