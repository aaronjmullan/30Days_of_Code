import java.io.*;
import java.util.*;

abstract class Book {
    
    String title; 
    String author;
    
    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
    
}

class myBook extends Book {
    
    private int price;
    
    myBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    @Override
    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}

public class Solution {
    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        String title = readIn.nextLine();
        String author = readIn.nextLine();
        int price = readIn.nextInt();
        
        Book novel = new myBook(title, author, price);
        novel.display();
     
    }
}
