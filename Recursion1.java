import java.util.Scanner;

public class Recursion1 {

    public static int first=-1;
    public static int last =-1;
    public static void main(String[] args) {
        // this is the code of find the indexes of  first occorunce and the last occorunce of an element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        // System.out.println();
        System.out.print("Enter the charecter you want to find: ");
        char a = sc.next().charAt(0);
        occour(str, a, 0);

    }

    static void occour(String s, char a,int len){
        
        if(len == s.length()){
            System.out.println("Starting index found at "+first+" and ending index found at "+last);
            return;
        }
        char current = s.charAt(len);
        if(current== a){
            if(first == -1){
                first =len;
            }
            else{
                last = len;
            }

        }
        occour(s, a, len+1);
    }
}
