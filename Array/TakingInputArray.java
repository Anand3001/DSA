import java.util.Scanner;

public class TakingInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Initialisation and indexing
        int[] arr=new int[4];
        //Taking Input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
