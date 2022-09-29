import java.util.*;

public class Recursion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        cal(s,0,"");
   
    }

    public static void cal(String s, int ind, String newStr){
        if(ind==s.length()){
            System.out.println(newStr);
            return;
        }
        char c = s.charAt(ind);
        cal(s,ind+1,newStr+c);
        cal(s,ind+1,newStr);
    }
}
