import java.util.Scanner;

public class recursion2 {


    static boolean recursion(int arr[],int a){
        if(a==arr.length-1){
            // System.out.println("true");
            return true;
        }
        if(arr[a] < arr[a+1]){
            return recursion(arr, a+1);
        }
        else
            return false;

        // return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter 5 integers separate with space: ");

        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }

        boolean a = recursion(arr,0);
        System.out.println(a);


    }
}
