import java.io.*;
import java.util.*;

class Printer<E> {
    
    static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        
        Scanner readin = new Scanner(System.in);
        int n = readin.nextInt();
        Integer[] intArray = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            intArray[i] = readin.nextInt();
        }

        n = readin.nextInt();
        
        String[] stringArray = new String[n];
        
        for (int i = 0; i < n; i++) {
            stringArray[i] = readin.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> strPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        strPrinter.printArray(stringArray);
        
        if (Solution.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }     
    }
}
