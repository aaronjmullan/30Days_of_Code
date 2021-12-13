import java.io.*;
import java.util.*;

class Node {
    
    Node left, right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }   
}

public class Solution {

    public static Node insert(Node root, int data) {
        
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }       
    }

    private static int getHeight(Node root) {
        
        if (root == null) {
            return -1;
        } else {
            return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        
        Scanner readin = new Scanner(System.in);
        
        int x = readin.nextInt();
        Node  root = null;
        
        while (x-- > 0) {
            int data = readin.nextInt();
            root = insert(root, data);
        }

        int height = getHeight(root);
        System.out.println(height);      
    }
}
