public class Recursion7 {

    public static String arr[]= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static int cnt =0;

    public static void MobileCombination(String str, int a,String combination){
        if(a==str.length()){
            System.out.println(combination);
            cnt++;
            return;
        }
        String mapping = arr[str.charAt(a)-'0'];
        for(int i=0;i<mapping.length();i++){
            MobileCombination(str, a+1, combination+mapping.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        String str = "236";
        MobileCombination(str, 0, "");
        System.out.println(cnt);
    }
}
