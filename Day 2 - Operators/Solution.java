import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {
  
  public static void solve(double meal_cost, int tip_percent, int tax_percent) {

      // Declare variables, set value equal to passed parameters.
        double mCostVal = meal_cost;
        int tipPerVal = tip_percent;
        int taxPerVal = tax_percent;
        
      // Calculate the values of the tip and tax of meal.
        double costTip = mCostVal * tipPerVal / 100; 
        double costTax = mCostVal * taxPerVal / 100;

      // Calculate and cast result of rounding operation to int and save to 'intPrice' variable.
        double totalPrice = mCostVal + costTip + costTax;
        int intPrice = (int) Math.round(totalPrice);
    
      // Print result to stdout.
        System.out.println(intPrice);

    }
  
    public static void main(String[] args) throws IOException {
      
      // Read text from character input stream
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      // Declare variables, set value to current line.
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

      // Pass variables defined above to solve method.
        solve(meal_cost, tip_percent, tax_percent);

      // Close bufferedReader.
        bufferedReader.close();
    }
}
