import java.util.*;

public class Solution {
    public static void main(String[] args){

        Scanner readIn = new Scanner(System.in);
        int array[][] = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = readIn.nextInt();
            }
        }

        int max = -9 * 7;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                    int sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + 
                    array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
