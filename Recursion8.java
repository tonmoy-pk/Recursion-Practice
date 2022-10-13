public class Recursion8 {
    public static void main(String[] args) {
        String str = "abc";
        printPerputation(str, "");
    }
    public static void printPerputation(String str, String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currentchar = str.charAt(i);
            String substring = str.substring(0, i)+str.substring(i+1);
            //for the first time the substring is bc and a is added to the new string
            //here we figure out substring without current char for next funtion call
            printPerputation(substring, newStr+currentchar);
            //in the first function call the substring is "bc" goes as str and newstr as "a"
        }        
    }
}
