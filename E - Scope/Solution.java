import java.io.*;
import java.util.*;

class Difference {
    
    private int[] elements;
    public int maxDifference;
    
    Difference(int[] elements) {
        this.elements = elements;
    }
    
    public void calcDifference() {
        
        int max = 0;
        
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int abs = Math.abs(elements[i] - elements[j]);
                if (abs > max) {
                    max = abs;
                }
            }
        }
        maxDifference = max;
    }   
}

public class Solution {

    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        
        int n = readIn.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = readIn.nextInt();
        }
        readIn.close();
        
        Difference diff = new Difference(array);
        
        diff.calcDifference();
        System.out.print(diff.maxDifference);
    }
}
