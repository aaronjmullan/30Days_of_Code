import java.util.*;

public class Solution {
    
    public static int minimum_index(int[] seq) {
        
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minmum value index from an empty      sequence");           
        }
        
        int min_idx = 0;
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
     
    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }
    
    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[]{25, 5, 8, 51, 2};
        }
    
        public static int get_expected_result() {
            return 4;
        }
    }
    
    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[]{3, 2, 2};
        }
        
        public static int get_expected_result() {
            return 1;
        }
    } 
    
    public static void TestEmptyArray() {
        
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException ex){
            return;
        } 
        throw new AssertionError("Exception wasn't throw as expected");
    }
    
    public static void TestUniqueValues() {
        
        int[] seq = TestDataUniqueValues.get_array();
        
        if(seq.length < 2) {
            throw new AssertionError("This array has less than 2 elements");
        }
        
        Integer[] temp = new Integer[seq.length];
        
        for (int i = 0; i < seq.length; i++) {
            temp[i] = Integer.valueOf(seq[i]);
        }
        
        if (!((new LinkedHashSet<Integer>(Arrays.asList(temp))).size() == seq.length)) {
            throw new AssertionError("Not all values are unique");
        }
        
        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("Expected result is different from the result");
        }       
    }
    
    public static void TestExactlyTwoDifferentMinimums() {
        
        int seq[] = TestDataExactlyTwoDifferentMinimums.get_array();
        
        if(seq.length < 2) {
            throw new AssertionError("This array has less than 2 elements");
        }
        
        int[] temp = seq.clone();
        Arrays.sort(temp);
        
        if(!(temp[0] == temp[1] && (temp.length == 2 || temp[1] < temp[2]))) {
            throw new AssertionError("This array does not contain 2 minimums");
        }
        
        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("Expected result is different from the result");
        } 
    }
    
    public static void main(String[] args) {       
        TestEmptyArray();
        TestUniqueValues();
        TestExactlyTwoDifferentMinimums();
        System.out.println("OK");
        
    }    
}
