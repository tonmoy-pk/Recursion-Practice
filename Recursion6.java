import java.util.HashSet;

// import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String s = "aab";
        HashSet<String> set = new HashSet<>();
        cal(s,0,"",set);
   
    }

    public static void cal(String s, int ind, String newStr, HashSet<String> set){
        if(ind==s.length()){
            if(set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char c = s.charAt(ind);
        cal(s,ind+1,newStr+c,set);
        cal(s,ind+1,newStr,set);
    }
}
