public class Recursion4 {
    // this is code of remove duplicate element of  an array and return new array
    public static boolean[] map = new boolean[26];
    public static String str = "";

    public static void removeDuplicate(String arr, int a){
        
        if(a==arr.length()){
            System.out.println(str);
            return;
        }
        char currenChar = arr.charAt(a);

        if(map[currenChar -'a']==true){
            removeDuplicate(arr, a+1);
        }
        else{
            map[currenChar -'a']=true;
            str = str + arr.charAt(a);
            removeDuplicate(arr, a+1);
        }
    }

    public static void main(String[] args) {
        String arr = "aasdjhssdfh";
        removeDuplicate(arr, 0);
        // System.out.println(str);
    }
}
