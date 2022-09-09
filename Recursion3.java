import java.util.Scanner;

public class Recursion3 {

    public static String res = "";
    public static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println(arrangeX(s, 0));


    }

    static String arrangeX(String s, int a){
        
        if(a==s.length()){
            for(int i=0;i<cnt;i++){
                res= res+'x';
            }
            return res;
        }
        if(s.charAt(a)!='x'){
            res = res+ s.charAt(a);
            return arrangeX(s, a+1);
        }
        else{
            cnt++;
            return arrangeX(s, a+1);
        }

        
    }
}
