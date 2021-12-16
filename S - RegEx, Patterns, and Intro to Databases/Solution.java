import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner readin = new Scanner(System.in);
        int N = readin.nextInt();
        
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String name = readin.next();
            String email = readin.next();
            Matcher matcher = pattern.matcher(email);
            
            if (matcher.find()) {
                list.add(name);
            }
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
