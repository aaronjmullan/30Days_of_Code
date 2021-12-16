import java.io.*;
import java.util.*;

class Node {    
    int data;
    Node next;
    
    Node(int d) {      
        data = d;
        next = null;  
    }    
}

public class Solution {
    public static Node removeDuplicates(Node head) {     
        Node current = head;             
        while (current != null && current.next != null) {
            while (current.next != null && current.data == current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }

    public static Node insert(Node head, int data) {    
        Node n = new Node(data);       
        if (head == null) 
            head = n;
        else if (head.next == null) 
            head.next = n;
        else {
            Node start = head;        
            while (start.next != null) 
                start = start.next;
                start.next = n;        
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
        Scanner readin = new Scanner(System.in);   
        Node head = null;
        int N = readin.nextInt();  
        while (N-- > 0) {
            int data = readin.nextInt();
            head = insert(head, data);
        }      
        head = removeDuplicates(head);
        display(head);
    }
}
