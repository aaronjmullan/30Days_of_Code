import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
           
        Scanner readIn = new Scanner(System.in);
        int n = readIn.nextInt();
        readIn.close();
        
        AdvancedArithmetic myCalc = new Calculator();
        int total = myCalc.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(total);
                       
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
          
    @Override
    public int divisorSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                total+= i;
            }
        }
            return total;
    }         
}
