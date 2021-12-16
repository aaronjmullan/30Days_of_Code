import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner readin = new Scanner(System.in);
        
        int d1 = readin.nextInt();
        int m1 = readin.nextInt();
        int y1 = readin.nextInt();  
        int d2 = readin.nextInt();
        int m2 = readin.nextInt();
        int y2 = readin.nextInt();       
        int fine = 0;
        
        if (y1 > y2) {
            fine+= 10000;
        } else if (y1 == y2) {
            if (m1 > m2) {
                fine = (m1 - m2) * 500;
            } else if (m1 == m2 && d1 > d2) {
                fine = (d1 - d2) * 15;
            }
        }
        System.out.println(fine);
    }
}
