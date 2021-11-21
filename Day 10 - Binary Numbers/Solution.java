import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner readIn = new Scanner(System.in);
        int n = readIn.nextInt();
        readIn.close();
        
        int sum = 0, max = 0;
        
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if(sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}
