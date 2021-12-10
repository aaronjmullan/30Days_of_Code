import java.io.*;
import java.util.*;

class Calculator {
    
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }   
}

public class Solution {

    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        int T = readIn.nextInt();
        
        while (T-- > 0) {
            int n = readIn.nextInt();
            int p = readIn.nextInt();
            Calculator myCalc = new Calculator();
            try {
                int result = myCalc.power(n, p);
                System.out.println(result);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }            
    }
}
