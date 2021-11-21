import java.io.*;
import java.util.*;

class Person {
    
    protected String firstName;
    protected String lastName;
    protected int idNum;
    
    Person(String firstName, String lastName, int idNum) {
           
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
    }
    
    public void printPersonData() {
        
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNum);
    }
}

class Student extends Person {
    
    private int[] testScores;
    
    Student(String firstName, String lastName, int id, int[] testScores) {
        
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    
    char calculate() {
        
        int totalScore = 0;
        
        for (int testScore : testScores) {
            totalScore+= testScore;
        }
        int averageScore = totalScore / testScores.length;
        
        if (averageScore >= 90 && averageScore <= 100) {
            return 'O';
        } else if (averageScore >= 80 && averageScore < 90) {
            return 'E';
        } else if (averageScore >= 70 && averageScore < 80) {
            return 'A';
        } else if (averageScore >= 55 && averageScore < 70) {
            return 'P';
        } else if (averageScore >= 40 && averageScore < 55) {
            return 'D';
        } else {
            return 'T';
        }     
    }     
}

public class Solution {

    public static void main(String[] args) {
        
        Scanner readIn = new Scanner(System.in);
        
        String firstName = readIn.next();
        String lastName = readIn.next();
        int idNum = readIn.nextInt();
        int numScores = readIn.nextInt();
        int[] testScores = new int[numScores];
        
        for (int i = 0; i < numScores; i++) {
            testScores[i] = readIn.nextInt();
        }
        readIn.close();

        Student student = new Student(firstName, lastName, idNum, testScores);
        student.printPersonData();
        
        System.out.println("Grade: " + student.calculate());

    }
}
