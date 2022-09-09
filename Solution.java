import java.util.Scanner;

// import java.util.*;

public class Solution {


    public static void main(String args[]) {
        // reverse a string using recursion 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String line = sc.next();
        int a = line.length();
        rev(line, a);




    }

    static void rev(String s, int a){
        if(a==0)
            return;
        System.out.print(s.charAt(a-1));
        
        rev(s, a-1);

    }
}