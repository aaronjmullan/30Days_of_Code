import java.io.*;
import java.util.*;

public class Solution {

    private LinkedList stack, queue;
    
    public Solution() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }
    
    private void pushCharacter(char ch) {
        this.stack.push(ch);  
    }
        
    private char popCharacter() {
        return (char) this.stack.pop();           
    }
              
    private void enqueueCharacter(char ch) {
        this.queue.addLast(ch);
    }
        
    private char dequeueCharacter() {
        return (char) this.queue.remove(0);
    }

    public static void main(String[] args) {
    
        Scanner readIn = new Scanner(System.in);
        String input = readIn.nextLine();
        readIn.close();
        
        char[] s = input.toCharArray();
        
        Solution sol = new Solution();
        
        for (char c : s) {
            sol.pushCharacter(c);
            sol.enqueueCharacter(c);
        }
        
        Boolean isPalindrome = true;
        
        for (int i = 0; i < s.length / 2; i++) {
            if(sol.popCharacter() != sol.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) 
                            ? "not a palindrome." : "a palindrome."));     
    }
}
