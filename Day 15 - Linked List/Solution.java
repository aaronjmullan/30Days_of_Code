import java.io.*;
import java.util.*;

class Node {
    
    int data;
    Node next;
    
    Node (int data) {
        
        this.data = data;
        this.next = null;
    }
    
}

public class Solution {

    public static Node insert(Node head, int data) {
        
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = new Node(data);           
        }
        return head;     
    }

    public static void display(Node head) {
        
        Node start = head;
        
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }     
    }

    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        Node head = null;
        int N = readIn.nextInt();
        
        while (N-- > 0) {
            int element =  readIn.nextInt();
            head = insert(head, element);
        }
        
        display(head);
        readIn.close();
    }
}
