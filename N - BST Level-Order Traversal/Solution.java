import java.io.*;
import java.util.*;

class Node {
    
    Node left, right;
    int data;
      
    public Node(int data) {      
        this.data = data;
        left = right = null;       
    } 
}

public class Solution {

    public static void levelOrder(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.data + " ");                               
            
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        } 
    }

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

    public static void main(String[] args) {
        
        Scanner readin = new Scanner(System.in);
        
        int T = readin.nextInt();
        Node root = null;
        
        while (T-- > 0) {
            int data = readin.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);      
    }
}
