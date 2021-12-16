import java.util.Scanner;

public class Solution {
    
    public static int bitwiseAnd(int N, int K) {
        
        int ans = 0;
        
        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int result = A & B;
                if (result > ans && result < K) {
                    ans = result;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
    
        Scanner readin = new Scanner(System.in);
        int T = readin.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int N = readin.nextInt();
            int K = readin.nextInt();
            
            System.out.println(bitwiseAnd(N, K));
        }
        readin.close();   
    }
}
