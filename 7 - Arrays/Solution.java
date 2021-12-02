import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        
      // Bufferered Reader to take input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

      // Define and generate values for list using bufferedreader input
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
      // Reversed for loop - print out value with space
        for (int i = arr.size() -1; i >= 0; i--){
            System.out.print(arr.get(i) + " ");
        }  
    }
}
